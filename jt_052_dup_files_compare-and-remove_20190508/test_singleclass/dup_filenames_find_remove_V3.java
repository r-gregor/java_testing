// filename: dup_filenames_find_remove_V3.java

import java.io.*;
import java.util.*;

// import java.io.File;
// import java.io.IOException;

public class dup_filenames_find_remove_V3 {
    
    public static Map<String, String> fjl_list = new HashMap<>();
    public static Map<String, String> other_fjl_list = new HashMap<>();

    public static void main(String[] args) {
        File currentDir = new File("."); // current directory
        File otherDir = new File("C:\\Users\\gregor.redelonghi\\Downloads");
        mapDirectoryContents(currentDir, fjl_list);
        mapDirectoryContents(otherDir, other_fjl_list);
        
        printMap(other_fjl_list);
        
        System.out.println("\n" + "=============================================================" + "\n");
        
        // printMap(fjl_list);
    }

    
    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("Filename: %s%nPath: %s%n%n", entry.getKey(), entry.getValue());
        }
    }

    public static void mapDirectoryContents(File dir, Map<String, String> mylist) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    // System.out.println(file.getCanonicalPath());
                    mapDirectoryContents(file, mylist);
                } else {
                    // System.out.println(file.getCanonicalPath());
                    // System.out.println(file.getParentFile().getCanonicalPath() + "\\" + file.getName());
                    mylist.put(file.getName(), file.getParentFile().getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
