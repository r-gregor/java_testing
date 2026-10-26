import org.paukov.combinatorics3.*;
import java.util.*;
import java.util.stream.Collectors;

public class Combinations2 {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<List<Integer>> combinations = Generator.combination(nums)
        .simple(3)
        .stream()
        .collect(Collectors.<List<Integer>>toList());

        Integer sum = 12;
        for (List<Integer> comb: combinations) {
            Integer mysum = 0;
            for (Integer num : comb) {
                mysum += num;
            }

            if (mysum == sum) {
                System.out.println("The sum of elements in: " + comb + " is " + sum);
            }
        }
    }

    
}

