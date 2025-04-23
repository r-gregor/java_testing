// filename ArrayTest.java

public class ArrayTest {

    /**main method */
    public static void main(String[] args) {
        int[] L1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] L2 = new int[L1.length];
        char[] NM = {'G', 'r', 'e', 'g', 'o', 'r'};

        for (int i = 0; i < L1.length; i++) {
            L2[i] = L1[i] * 2;
        }

        System.out.println("\n" + "Displaying the contents of array L1:");
        display_array(L1);

        System.out.println("\n" + "Displaying the contents of array L2:");
        display_array(L2);

        System.out.println("\n" + "Displaying contents of an char[] array NM:");
        System.out.print(NM);
    }

    public static void display_array(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%02d ", array[i]);
        }
        System.out.println();
    }
}
