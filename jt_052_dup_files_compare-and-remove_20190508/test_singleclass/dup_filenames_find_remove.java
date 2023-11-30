// filename: dup_filenames_find_remove.java

import java.io.*;
import java.util.*;

// import java.io.File;
// import java.io.IOException;

public class dup_filenames_find_remove {
    
    public static List<String> fjl_list = new ArrayList<>();

    public static void main(String[] args) {
        File currentDir = new File("."); // current directory
        displayDirectoryContents(currentDir);
        
        for (String fjl : fjl_list) {
            System.out.println(fjl);
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
                    fjl_list.add(file.getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
