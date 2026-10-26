import java.util.*;

public class SumOf2Nums {
    public static void main(String[] args) {
        int[] nums = new int[]{-18, -12, -10, -6, -4, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int i = 0;
        int j = nums.length - 1;
        int sum = 8;

        System.out.println("Sorted list: " + Arrays.toString(nums));
        System.out.println("Pairs of numbers from the list that make the sum of " + sum + ":");

        while (i < j) {
            int mysum = nums[i] + nums[j];
            if (mysum == sum) {
                System.out.printf(
                    "(%d, %d)%n", nums[i], nums[j]);
                i = i + 1;
                continue;
            } else if (mysum > sum) {
                j = j - 1;
            } else {
                i = i + 1;
            }
        } // end while

    } // end main()

} // end class