// filename: DirWalk.java
// NO main!


import java.io.*;
import java.util.*;

class DirWalk {
    public File mydir;
    public Map<String, String> fjls_list = new HashMap<String, String>();
    
    // default constructor
    public DirWalk() {
        System.out.println("Class DirWalk must be parameterized with <String dir>!");
        System.exit(1);
    }
    
    // parameterized constructor
    public DirWalk(String dir) {
        this.mydir = new File(dir);
        mapDirContent(this.mydir, this.fjls_list);
    }
    
    // METHODS // METHODS // METHODS // METHODS // METHODS // METHODS // METHODS //
    
    /** Store dir content into map with filename as key and path as value
    *   @param  <String> dir    directory
    *
    */
    public void mapDirContent(File dir, Map<String, String> mylist) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    // System.out.println(file.getCanonicalPath());
                    mapDirContent(file, mylist);
                } else {
                    mylist.put(file.getName(), file.getParentFile().getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end func


    /** Print map contents in format:
    *       filename: [filename]
    *       path: [/full/path/name/of/the/file/]
    *
    */
    public void printMap() {
        for (Map.Entry<String, String> entry : this.fjls_list.entrySet()) {
            System.out.printf("%nFilename: %s%nPath: %s%n", entry.getKey(), entry.getValue());
        } // end for
    } // end func

    
    /** Print map keys (filenames) only in format:
    *       filename: [filename]
    *
    */
    public void printMapKeys() {
        for (Map.Entry<String, String> entry : this.fjls_list.entrySet()) {
            System.out.printf("Filename: %s%n", entry.getKey());
        } // end for
    } // end func

    
    /** Print map contents as FULL path
    *
    */
    public void printMapFullPath() {
        for (Map.Entry<String, String> entry : this.fjls_list.entrySet()) {
            System.out.printf("%s" + File.separator + "%s%n", entry.getValue(), entry.getKey());
        } // end for
    } // end func


    /** Check if map contains key */
    public void hasKey(String key) {
        String path;
        if (this.fjls_list.containsKey(key)) {
            path = fjls_list.get(key) + File.separator + key;
            System.out.printf("Path:%n%s%n", path);
        } else {
            // System.out.println("There is NO key" + key + "in this map.");
            System.out.printf("There is NO key [%s] in this map.%n", key);
        } // end if

    } // end func
    
    // METHODS // METHODS // METHODS // METHODS // METHODS // METHODS // METHODS //
    
    
} // end class
