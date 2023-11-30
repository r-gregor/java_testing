// Main2.java

import java.util.*;
import java.io.*;

public class Main2 {
    private String gregs_PL;
    private String gregs_PL_do;
    private String tadejas_PL;
    private String tadejas_PL_do;
    
    private File file = new File("test.txt");
    
    private void getExtInfo() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = null;
        while ((st = br.readLine()) != null) {
            String[] items = st.split(",");

            switch(items[0].toUpperCase()) {
                case "GREGOR":
                    gregs_PL = items[1];
                    gregs_PL_do = items[2];
                    break;
                    
                case "TADEJA":
                    tadejas_PL = items[1];
                    tadejas_PL_do = items[2];
                    break;

                default:
                    ;
            }
        }
    }
    
    private void displayInfo() {
        System.out.printf("Greg's info: PL=%s, exp. date=%s%n",gregs_PL, gregs_PL_do);
        System.out.printf("Tadeja's info: PL=%s, exp. date=%s%n", tadejas_PL, tadejas_PL_do);
    }

    /** main */
    public static void main(String[] args) throws Exception {
        
        Main2 mm = new Main2();
        
        mm.getExtInfo();
        mm.displayInfo();

    }
    
}