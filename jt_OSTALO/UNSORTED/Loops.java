import java.util.*;

class Loops {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int tst = 0;

            for (int i = 0; i < nums.length; i++) {
                System.out.println("Element " + i + ": " + nums[i]);
                tst++;
                
                if (tst == 8) {
                    System.out.println("Reached " + tst + ". Skipping!");
                    continue;
                }
            }

    }
}