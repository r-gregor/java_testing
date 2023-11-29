// filename: PrintStringArray.java

public class PrintStringArray {
    
    /** main */
    public static void main(String[] args) {
        String[] snts = {"Gregor", "Redelonghi", "lives", "in", "Ljubljana", "-", "1000", ",","Slovenia","."};
        String my_line = snts[0];
        
        for (int i = 1; i < snts.length; i++) {
            if (snts[i].length() == 1) {
                char single = snts[i].charAt(0);
                
                if (! Character.isLetter(single)) {
                    my_line = my_line + snts[i];
                } else {
                    my_line = my_line + " " + snts[i];
                }
                
            } else {
                my_line = my_line + " " + snts[i];
            
            }

        } // end for
        
        my_line = my_line.replaceAll(" {2,}", ""); // replace 2-or more spaces with one space
        my_line = my_line.replaceAll("[-_] {1,}", "-"); // replace "- ", or "_ " with "-"
        System.out.println(my_line);
        
    } // end main
} // end class