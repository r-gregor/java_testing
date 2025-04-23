public class chars {

    // function: print chars in array from start to end
    public static void printCharLine(char[] array, int start, int end) {
        int hs_n = 12;
        int es_n = 5;
        
        String hs = "%-" + hs_n + "s";
        String es = "%" + es_n + "s";
        
        int N1 = hs_n + (end - start) * es_n;
        System.out.printf(hs,"Character:");
        
        
        for (int i = start; i < end; i++) {
            System.out.printf(es, array[i]);
        }
        System.out.println();
        
        
        for (int k = 0; k < N1; k++) {
            System.out.print("-");
        }
        System.out.println();
        
        System.out.printf(hs,"Decimal:");
        
        
        for (int i = start; i < end; i++) {
            System.out.printf(es, (int)array[i]);
        }
        System.out.println("\n");
    }
    
    // MAIN
    public static void main(String[] args) {
        
        System.out.println("ASCII chars codes:");
        char[] chars = new char[62];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char)(i + 65);
        }
        
        
        for (int i = 26; i < 52; i++) {
            chars[i] = (char)(i + 71);
        }
        
        
        for (int i = 52; i < 62; i++) {
            chars[i] = (char)(i - 4);
        }
        
        
        printCharLine(chars, 0, 26);
        printCharLine(chars, 26, 52);
        printCharLine(chars, 52, 62);
       
        for (int i = 1; i < 25; i++ ) {
            System.out.printf("The character at offset %d from 'A' is: %s%n", i, (char)((int)'A' + i));
        }
       
       System.out.printf("The character at unicode 02E5: %s%n", new String("\u02E5"));

       
    }// end main
    
} // end class