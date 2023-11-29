// filename PrintTest.java
// import funcl.funcl;

public class PrintTest {

    public static int startnum = 800;
    public static int mynums = 1000;

    /** MAIN method */
    public static void main(String[] args) {
        // clearing the ecreen
        funcl.cls();
        funcl.start_info();
        System.out.print(funcl.tms());
        System.out.println("Printing first " + mynums + " numbers, strating with " + (startnum + 1) + " ...");
        printNums(mynums);

        System.out.print("\n" + funcl.tms());
        System.out.println("Printing first " + mynums + " numbers, strating with " + (startnum + 1) + ", delimited  with \"|\"...");
        printNumsVert(mynums, "|");
    }

    /*
    // function that clears the screen
    public static void cls() {
        System.out.print("\033[H\033[2J");
    }
    */


    /** Print nums in rows of NUMS_PER_LINE numbers right padded,
     * and divided by vertical "|" line
     * @param num           number of numbers to display
     * @param vert_delim    delimiter character
     */
    public static void printNumsVert(int num, String vert_delim) {
        final int NUMS_PER_LINE = 20;
        int digitsnum = String.valueOf(num).length();
        String padding = String.valueOf(digitsnum + 1);
        for (int i = startnum + 1; i <= num; i++) {
            if (i % NUMS_PER_LINE == 0) {
                System.out.printf("%" + padding + "d\n", i);
            } else {
                System.out.printf("%" + padding + "d " + vert_delim, i);
            }
        }

    }

    /** Print nums in rows of NUMS_PER_LINE numbers right padded,
     * and divided by space
     * @param num   number of numbers to display
     */
    public static void printNums(int num) {
        final int NUMS_PER_LINE = 20;
        int digitsnum = String.valueOf(num).length();
        String padding = String.valueOf(digitsnum + 1);

        for (int i = startnum + 1; i <= num; i++) {
            if (i % NUMS_PER_LINE == 0) {
                System.out.printf("%" + padding + "d\n", i);
            } else {
                System.out.printf("%" + padding + "d", i);
            }
        }
    }
}
