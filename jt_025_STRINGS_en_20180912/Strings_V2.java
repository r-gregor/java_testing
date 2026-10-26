
public class Strings_V2 {
    // functions
    public static void EL() {
        System.out.println();
    }
    
    
    // ZEHR COOL!!
    public static void prnl(Object line) {
        System.out.println(line);
    }
    
    
    // function-1: print position of each char in a string --> string.charAt(i) --> i = 0 .. string.length
    public static void printStringPos(String str) {
        EL();
        int strlen = str.length();    // string length
        
        for (int i=0; i < strlen; i++) {
                System.out.printf("%-3s", str.charAt(i));
        }
        
        System.out.printf("\n");
        for (int i=0; i < strlen; i++) {
                System.out.printf("%-3s", i+1);
        }
        
    }
    
    // function-2: print position of each char in an array --> array[i] --> i = 0 .. array.length
    public static void printStringArrPos(String str) {
        EL();
        
        // convert string to array of chars:
        char[] str_arr = str.toCharArray();
        
        for (int i=0; i < str_arr.length; i++) {
            System.out.printf("Char at position %d: %s\n", i+1, str_arr[i]);
        }
    }
        
    // function-3: print a string
    public static void prnts(String str) {
        System.out.println(str);
    }
        
    
    // MAIN
    public static void main(String[] args) {
        
        // context 1 -----------------------------------------------------------------------------------------
        String str1 = "Gregor Redelonghi";
        int str1_len = str1.length();    // string length
        System.out.printf("Length of string str1: %d\n", str1_len);
        
        // function-1
        printStringPos(str1);
        
        // context 2 -----------------------------------------------------------------------------------------
        EL();
        String abc_L = "abcdefghijklmnoprstuvz";
        String abc_U = "ABCDEFGHIJKLMNOPRSTUVZ";
        
        // function-2
        printStringArrPos(abc_L);
        printStringArrPos(abc_U);
        
        // context 3 -----------------------------------------------------------------------------------------
        EL();
        String my_float = String.valueOf("1500.324586F");
        prnts("Printing a float converted to string and removing F from float:");
        prnts(my_float.replace("F", ""));
        
        EL();
        System.out.printf("Winpath to current user's home dir: %s.\n", System.getProperty("user.home"));
        
        
        // context 4 -----------------------------------------------------------------------------------------
        EL();
        String urls =    "http://www.majpage1.com\n" + 
                        "http://www.goodlady.com/get_the_number.html\n" +
                        "https://Protected.not4ye.gov/gret_in?%ggg;lll\n" +
                        "http://www.Gnaggle.moc";
                        
        // split string by delimiter "\n" and insert each item in an array
        String[] my_urls = urls.split("\n");
        
        // print each item of an array
        for (int i=0; i < my_urls.length; i++) {
            System.out.printf("Url, num %d:\t%s\n", i, my_urls[i]);
        }
        
        // print items that start with pattern
        EL();
        for (int i=0; i < my_urls.length; i++) {
            String item = my_urls[i];
            if (item.startsWith("https")) {
                System.out.printf("SSL protected URL: %s.\n", item);
            }
        }

        
    
    // END MAIN
    }
}
