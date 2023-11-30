
// filename: CreateSoftlink_en.java (V5)

// 20190204:    V1
// 20190204:    V2: added functions:    - public static String[] fname_parts(String fname)
//                                      - public static String rename_fname_to_linkname(String fname)
//
// 20190204:    V3: DOMA:   rename to [ CreateSoftlink_d.java ] (linux paths")
//                          move ProcessBuilder block to runCommand() function
//
// 20190204:    V4: DOMA:   move ProcessBuilder block to runCommand() function
//
// 20190205:    V5: functions: fname_full_path(fname, [win/nix]) --> returns fullpath string in win or nix
//                             format
//                  PROBLEM:    Cygwin WIN/NIX paths --> the source file path has to be absolute WIN path
//                              ==> created bash wrapper script: [ CreateSoftlink_java_wrapper.sh ]
//                              ==> COOL becouse absolute classpath could be declared.
//                              ==> Jar file ?? --> [ CreateSoftlink_jar_wrapper.sh ]
//              ...
//
// create jar file:
// $> gregor.redelonghi@cygwin-en [/home/gregor.redelonghi/JAVA_en_testing/20190204_create_softlink_run_shell_command]
// $> jar -cvfe CreateSoftlink_en.jar CreateSoftlink_en ./CreateSoftlink_en.class
//


import java.util.*;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;


public class CreateSoftlink_en {
    
    // ==== FUNCTIONS ===================================================================================

    /**
     * returns full path in "win" or "nix" format. It manages the cygwin path transformation.
     *
     * @param   file: filename (String)
     * @param   platform: win or nix (String)
     * @return  full_path_win: absolute path and filename for WIN platform, or
     * @return  full_path_nix: absolute path and filename for NIX platform
     */
    public static String file_full_path(String file, String platform) {
        
        File my_file = new File(file);
          
        if (platform == "win") {
            String full_path_win = my_file.getAbsolutePath();
            return full_path_win;
            
        } else if (platform == "nix") {
            String file_abs_path = my_file.getAbsolutePath();
            String full_path_nix = null;
            
            if (file_abs_path.contains("cygwin64")) {
                full_path_nix = file_abs_path.replace("C:\\Users\\gregor.redelonghi\\myprogs\\cygwin64\\", "/").replace("\\", "/");
            } else {
                full_path_nix = file_abs_path.replace("C:\\Users\\gregor.redelonghi\\", "/c/Users/gregor.redelonghi/").replace("\\", "/");
            }
            return full_path_nix;
            
        } else {
            System.out.println("Wrong platform string! Must be: [win/nix]");
            System.exit(1);
            return "";
        }
    }    
    
    // ==== FUNCTIONS ===================================================================================

    /**
     * returns a list of file absolute path (in Cygwin POSIX format) and filename, both as strings. The
     * filename full path is spllit on last "/". To construct full absolute path both strings must be
     *concatenated with "/"
     *
     * @param   fname: filename (String)
     * @return  the list (String[]) of absolute path and filename
     */
    public static String[] fname_parts(String fname) {
        
        // File my_fname = new File(fname);
        // String fname_full_path = file_full_path(fname, "nix");

        int sf_delim = fname.lastIndexOf("/");
        String sf_fpath = fname.substring(0, sf_delim);
        String sf_fname = fname.substring(sf_delim + 1);
        String[] sf_parts = {sf_fpath, sf_fname};
        return sf_parts;
    }

    // ==== FUNCTIONS ===================================================================================

    /**
     * returns a filename without extention to be used as a destination filename
     * to create a softlink
     *
     * @param   the filename (String) ... source
     * @return  the filename without extention for symlink name
     */
    public static String rename_fname_to_linkname(String fname) {
        String raw_name;
        if (fname.contains(".")) {
            int f_delim = fname.lastIndexOf(".");
            raw_name = fname.substring(0, f_delim);
        } else {
            raw_name = fname;
        }
        return raw_name;
    }

    // ==== FUNCTIONS ===================================================================================

    /**
     * runs external shell command to create symbolic (soft) link of a file (absolute path)
     *      - checks if source file exists (absolute path)
     *      - checks if dest file (symlink) exists (absolute path) and asks to owerwrite if exists
     *
     * to create a softlink
     *
     * @param   the filename (String) ... source
     * @return  the filename without extention for symlink name
     */
    public static void runCommand(String source_fname) throws IOException, InterruptedException {
        
        
        // NIX filenames
        String source_f_n = file_full_path(source_fname, "nix");
        System.out.println("Source file: " + source_f_n);
        
        String dest_f_n = rename_fname_to_linkname(source_f_n);
        System.out.println("Dest file: " + dest_f_n);

        // create WIN absolute paths
        String source_f_w = file_full_path(source_fname, "win");
        String dest_f_w = rename_fname_to_linkname(source_f_w);

        
        // check if files exist
        File sf = new File(source_f_w);
        File df = new File(dest_f_w);

        if (!sf.exists()) {
            System.out.printf("*** File [ %s ] NOT found! ***%n", source_f_n);
            System.exit(0);
        } else {
            System.out.print("\nSource file exists. Enter \"OK\" to continue:  ");
            Scanner user_input_2 = new Scanner(System.in);
            String ans_2 = user_input_2.nextLine();
                if (!ans_2.equals("OK")) {
                    System.out.println("You chose NOT to continue.");
                    System.exit(0);
                }
        }

        if (df.exists()) {
            if (sf.equals(df)) {
                System.out.println("*** Existing source and dest files are the same! ***");
                System.exit(0);
            }

            System.out.printf("Dest file [ %s ] exists! Overwrite? [Yes/No] ", dest_f_n);
            Scanner user_input = new Scanner(System.in);
            String answer = user_input.nextLine();
                if (!answer.equals("Yes")) {
                    System.out.println("You chose NOT to overwrite.");
                    System.exit(0);
                }
        }

        // create processes
        ProcessBuilder process_1 = new ProcessBuilder();
        process_1.command("bash", "-c", "ln -snfv " + source_f_n + " " + dest_f_n);
        System.out.println("Running process: creating softlink ...");
        
        // RUN ...
        Process process = process_1.start();

        // get output from processes
        StringBuilder output = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
        }

        int exitVal = process.waitFor();
        if (exitVal == 0) {
            // System.out.println("Success!");
            System.out.println(output);

        } else {
            //abnormal...
        }
    }

    // ==== FUNCTIONS ===================================================================================

    
    // MAIN
    public static void main(String[] args) throws IOException, InterruptedException {

        String usage =  "*** No source filename supplied as argument! ***\n" +
                        "\n" +
                        "usage: CreateSoftlink [file_name]\n\n" +
                        "               file_name:\n" +
                        "               - just file_name if in current directory, or\n" +
                        "               - full_path/file_name\n";

        String source_f = null;

        if (args.length != 1) {
            System.out.println(usage);
            System.exit(0);
        } else {
            source_f = args[0];
        }
        

        runCommand(source_f);
        System.out.println("*** Done! ***");
                
    } // end MAIN

} // end class
