    // filename: Main.java

import java.io.*;
import java.util.*;

public class Main {
    
    public static void printLine(int numchars, String symbol) {
       
        System.out.println();
        for (int i = 0; i < numchars; i++) {
            System.out.print(symbol);
        }
        System.out.println("\n");
    } // end func
   
    
    /** main */
    public static void main(String[] argv) {
        String mydir;
                
        if (argv.length == 1) {
            mydir = argv[0];
        } else {
            mydir = ".";
        } // end if

        DirWalk dw1 = new DirWalk(mydir);
        dw1.printMap();
        printLine(110, "="); // ===================================
        dw1.printMapKeys();
        printLine(110, "="); // ===================================
        dw1.printMapFullPath();
        printLine(110, "="); // ===================================
        
        // Test the hasKey method
        System.out.println();
        
        List<String> lst1 = Arrays.asList("Main.java", "css.css", "Mucho Gracias.txt", "o.gif");
        for (String el : lst1) {
            System.out.printf("%nIs [%s] in this map?%n", el);
            dw1.hasKey(el);
        }

    } // end main
} // end class
