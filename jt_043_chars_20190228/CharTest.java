// filename: CharTest.java

public class CharTest {
    
    public static void char_nums_print(char start) {
        for (int i = 0; i < 63; i++) {
            int charnum = start + i;
            char mychar = (char)charnum;
            System.out.printf("Number of char %s is: %d%n", mychar, charnum);
            
        }
    }
    
    public static void char_nums_print_ALL() {
        for (int i = 32; i < 128; i++) {
            int charnum = i;
            char mychar = (char)charnum;
            
            if (i % 10 == 0)
                System.out.printf("%4d: %-8s%n", charnum, mychar);
            else
                System.out.printf("%4d: %-8s", charnum, mychar);
            
        }
    }    
    
    
    public static void main(String[] args) {
        /*
        char start = 'A';
        char_nums_print(start);
        */
        
        char_nums_print_ALL();
    }
}
