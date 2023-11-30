    // filename: Main_V2.java

import java.io.*;
import java.util.*;

public class Main_V2 {
    
    public static void printLine(int numchars, String symbol) {
       
        System.out.println();
        for (int i = 0; i < numchars; i++) {
            System.out.print(symbol);
        }
        System.out.println("\n");
    } // end func
   
    
    /** Main_V2 */
    public static void main(String[] argv) {
        String mydir;
                
        if (argv.length == 1) {
            mydir = argv[0];
        } else {
            mydir = ".";
        } // end if

        DirWalk_V2 dw2 = new DirWalk_V2(mydir);
        dw2.printMap();
        printLine(110, "="); // ===================================
        dw2.printMapKeys();
        printLine(110, "="); // ===================================
        dw2.printMapFullPath();
        printLine(110, "="); // ===================================
        
        // Test the hasKey method
        System.out.println();
        
        List<String> lst1 = Arrays.asList("Main_V2.java", "css.css", "Mucho Gracias.txt", "o.gif");
        for (String el : lst1) {
            System.out.printf("%nIs [%s] in this map?%n", el);
            dw2.hasKey(el);
        }

    } // end Main_V2
} // end class
