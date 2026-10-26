// filename ExceptionTest2.java

public class ExceptionTest4 {
    // public static int j;

    public static void main(String[] args) {
        int size = 9;
        int nums[] = new int[size];

        try {
            for (int i = 0; i < 11; i++) {
                // j = i;
                nums[i] = size - i;
            }

            for (int n: nums) {
                System.out.printf("%d, ", n);
            }
            System.out.println("");


        } catch (Exception m) {
            System.out.println(m);
        } finally {
            System.out.println("The contents of an array:");
            for (int n: nums) {
                System.out.printf("%d, ", n);
            }
            System.out.println();
        }
    }
}
