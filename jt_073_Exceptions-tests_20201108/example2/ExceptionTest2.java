// filename ExceptionTest2.java

public class ExceptionTest2 {
    public static int j;

    public static void main(String[] args) {
        int size = 9;
        int nums[] = new int[size];

        try {
            for (int i = 0; i < 11; i++) {
                j = i;
                nums[i] = size - i;
            }

            for (int n: nums) {
                System.out.printf("%d, ", n);
            }
            System.out.println("");

        } catch (IndexOutOfBoundsException e1) {
            int k = j;
            // prints: "java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10"
            //System.out.println(e1);
            System.out.println("Oops. Trying to reach beyond last index!");
            System.out.printf("Tried to enter value at index %d, but the last index is %d!%n", k, size - 1);
        } catch (Exception m) {
            System.out.println("Unknown exception occured!");
        } finally {
            System.out.println("The contents of an array:");
            for (int n: nums) {
                System.out.printf("%d, ", n);
            }
        }
    }
}