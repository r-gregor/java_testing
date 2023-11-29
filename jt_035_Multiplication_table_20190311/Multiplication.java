// Multiplication.java

public class Multiplication {

    /** Main method */
    public static void main (String[] args) {
        int fcw = 6; // first column width: %4d + "" + "|"
        int k = (10 * 4) + fcw; // dnumber of chars in one line = 10 numbers %4 + fsw

        // title -- put the midle in the middle
        String title = "Multiplication Table";
        int title_lngth = title.length();
        int title_start = k / 2 - title_lngth / 2 + fcw;
        System.out.println();
        for (int i = 0; i < title_start; i++) {
            System.out.print(" ");
        }
        System.out.println(title);

        // header
        // 6x space
        for (int spc = 0; spc < 6; spc++) {
            System.out.print(" ");
        }

        // header numbers (1 - 10)
        for (int i = 1; i < 11; i++) {
            System.out.printf("%4d", i);
        }

        // header row sepparator line
        System.out.println();
        System.out.print("  "); // 2 spaces
        for (int z = 0; z < k - 2; z++) {
            System.out.print("-");
        }
        System.out.println();

        // table body
        for (int i = 1; i < 11; i++) {
            System.out.printf("%4d |", i);
            for (int j = 1; j < 11; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();

        }
        System.out.println();
    }
}
