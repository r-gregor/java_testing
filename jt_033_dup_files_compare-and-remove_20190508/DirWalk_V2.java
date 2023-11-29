// filename: DirWalk_V2.java
// NO main!
// V2:  20200320/d: update
// a value of a map changed from String to ArrayList<String> -- multiple paths possible
// all functions changed to use ArrayList<String> as value.


import java.io.*;
import java.util.*;

class DirWalk_V2 {
    public File mydir;
    public Map<String, ArrayList<String>> fjls_list = new HashMap<String, ArrayList<String>>();
    
    // default constructor
    public DirWalk_V2() {
        System.out.println("Class DirWalk_V2 must be parameterized with <String dir>!");
        System.exit(1);
    }
    
    // parameterized constructor
    public DirWalk_V2(String dir) {
        this.mydir = new File(dir);
        mapDirContent(this.mydir, this.fjls_list);
    }
    
    // METHODS // METHODS // METHODS // METHODS // METHODS // METHODS // METHODS //
    
    /** Store dir content into map with filename as key and path as value
    *   @param  <String> dir    directory
    *
    */
    public void mapDirContent(File dir, Map<String, ArrayList<String>> mylist) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                String key = file.getName();
                String path = file.getParentFile().getCanonicalPath();

                if (file.isDirectory()) {
                    // System.out.println(file.getCanonicalPath());
                    mapDirContent(file, mylist);
                } else {
                    if (!mylist.containsKey(key)) {
                        mylist.put(key, new ArrayList<String>());
                        mylist.get(key).add(path);
                    } else {
                        mylist.get(key).add(path);
                    }

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
        for (Map.Entry<String, ArrayList<String>> entry : this.fjls_list.entrySet()) {
            // System.out.printf("%nFilename: %s%nPath: %s%n", entry.getKey(), entry.getValue());
            System.out.printf("%nFilename: %s%n", entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("Path: %s" + File.separator + "%n", entry.getValue().get(i));
            }

        } // end for
    } // end func



    
    /** Print map keys (filenames) only in format:
    *       filename: [filename]
    *
    */

    
    public void printMapKeys() {
        for (String key : this.fjls_list.keySet()) {
            System.out.printf("Filename: %s%n", key);
        } // end for
    } // end func
    

    
    /** Print map contents as FULL path
    *
    */
    public void printMapFullPath() {
        for (Map.Entry<String, ArrayList<String>> entry : this.fjls_list.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("%s" + File.separator + "%s%n", entry.getValue().get(i), entry.getKey());
            } 
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
