import java.util.*;
import java.io.IOException;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.Scanner;

public class PathTest {
    
    // ==== FUNCTIONS ===================================================================================
    
    public static String file_full_path(String file, String platform) {
        
        String fileName = Paths.get(file).toString();
        System.out.printf("fILEpATH: %s%n", fileName);
        
        Scanner input = new Scanner(System.in);
        String my_answer = input.nextLine();
        
        
        
        
        File my_file = new File(file);
                
        if (platform == "win") {
            String full_path_win = my_file.getAbsolutePath();
            return full_path_win;
            
        } else if (platform == "nix") {
            String full_path_nix = my_file.getAbsolutePath().replace("C:\\Users\\gregor.redelonghi\\myprogs\\cygwin64\\", "/").replace("\\", "/");
            return full_path_nix;
            
        } else {
            System.out.println("Wrong platform sign [win/nix]");
            System.exit(1);
            return "";
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
        
        
        // TEST
        String winpath = file_full_path(source_f, "win");
        System.out.printf("winpath: %s%n", winpath);
        
        String nixpath = file_full_path(source_f, "nix");
        System.out.printf("nixpath: %s%n", nixpath);
    }
}        