// filename: dup_filenames_find_remove_V2.java

import java.io.*;
import java.util.*;

// import java.io.File;
// import java.io.IOException;

public class dup_filenames_find_remove_V2 {
    
    public static Map<String, String> fjl_list = new HashMap<>();

    public static void main(String[] args) {
        // File currentDir = new File("."); // current directory
        File currentDir = new File("C:\\Users\\gregor.redelonghi\\Downloads");
        displayDirectoryContents(currentDir);
        
        for (Map.Entry<String, String> entry : fjl_list.entrySet()) {
            System.out.printf("Filename: %s%nPath: %s%n%n", entry.getKey(), entry.getValue());
        }
    }
    
    public static void displayDirectoryContents(File dir) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    // System.out.println(file.getCanonicalPath());
                    displayDirectoryContents(file);
                } else {
                    // System.out.println(file.getCanonicalPath());
                    fjl_list.put(file.getName(), file.getParentFile().getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
