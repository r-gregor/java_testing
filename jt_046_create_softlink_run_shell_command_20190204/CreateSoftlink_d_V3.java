// filename: CreateSoftlink_d.java (V3)

// 20190204:    V1
// 20190204:    V2: added functions:    - public static String[] fname_parts(String fname)
//                                      - public static String rename_fname_to_linkname(String fname)
//
// 20190204:    V3: DOMA:   rename to [ CreateSoftlink_d.java ] (linux paths")
//
//
// TO DO:       functions: unix_name_to_win_name(), win_name_to_unixname()
//              test: fulpath of win_name-sf
//              ...


import java.util.*;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;


public class CreateSoftlink_d_V3 {

    // ==== FUNCTIONS ===================================================================================

    /**
     * returns a list of file absolute path (in Cygwin POSIX format) and filename, both as strings. The
     * filename full path is spllit on last "/". To construct full absolute path both strings must be
     * concatenated with "/"
     *
     * @param   fname: filename (String)
     * @return  the list (String[]) of absolute path and filename
     */
    public static String[] fname_parts(String fname) {
        File file = new File(fname);

        // WIN only
        // String fname_full_path = file.getAbsolutePath().replace("C:\\Users\\gregor.redelonghi\\myprogs\\cygwin64\\", "/").replace("\\", "/");

        // LINUX only
        String fname_full_path = file.getAbsolutePath();

        // test
        // System.out.println(fname_full_path);

        int sf_delim = fname_full_path.lastIndexOf("/");
        String sf_fpath = fname_full_path.substring(0, sf_delim);
        String sf_fname = fname_full_path.substring(sf_delim + 1);
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
        int f_delim = fname.lastIndexOf(".");
        String raw_name = fname.substring(0, f_delim);
        return raw_name;
    }

    // ==== FUNCTIONS ===================================================================================

    /**
     * runs external shell command to create symbilic (soft) link of a file (absolute path)
     *      - checks if source file exists (absolute path)
     *      - checks if dest file (symlink) exists (absolute path) and asks to owerwrite if exists
     *
     * to create a softlink
     *
     * @param   the filename (String) ... source
     * @return  the filename without extention for symlink name
     */
    public static void runCommand(String source_f, String dest_f) throws IOException, InterruptedException {

        // create processes
        ProcessBuilder process_1 = new ProcessBuilder();
        process_1.command("bash", "-c", "ln -snfv " + source_f + " " + dest_f);
        System.out.println("Running proces: creating softlink ...");
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

        // String source_f = "base_test_file.txt";
        String dest_f = rename_fname_to_linkname(source_f);


        // source file
        String[] sf_parts = fname_parts(source_f);
        String sf_fpath = sf_parts[0];
        String sf_fname = sf_parts[1];
        String sf_full_fname = sf_fpath + "/" + sf_fname;


        // dest file
        String[] df_parts = fname_parts(dest_f);
        String df_fpath = sf_fpath;
        String df_fname = dest_f;
        String df_full_fname = df_fpath + "/" + df_fname;

        /*
        // TEST
        System.out.println("\nSource file [path, name, full name]:");
        System.out.println(sf_fpath);
        System.out.println(sf_fname);
        System.out.println(sf_full_fname);
        System.out.println("\nDest (link) file [path, name, full name]:");
        System.out.println(df_fpath);
        System.out.println(df_fname);
        System.out.println(df_full_fname);
        */

        /*
        // TEST STOP
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        */


        // if Files ... exists ...
        File sf = new File(sf_full_fname);
        File df = new File(df_full_fname);
        if (!sf.exists()) {
            System.out.printf("*** File [ %s ] NOT found! ***%n", sf_fname);
            System.exit(0);
        } else {
            System.out.printf("Source file [ %s ] exists. OK to continue.%n", sf_fname);
        }

        if (df.exists()) {
            System.out.printf("Dest file [ %s ] exists! Overwrite? [Yes/No] ", df_fname);
            Scanner user_input = new Scanner(System.in);
            String answer = user_input.nextLine();
                if (!answer.equals("Yes")) {
                    System.out.println("You chose NOT to overwrite.");
                    System.exit(0);
                }
        }

        //
        runCommand(sf_full_fname, df_full_fname);
        System.out.println("*** Done! ***");
    } // end MAIN

} // end class
