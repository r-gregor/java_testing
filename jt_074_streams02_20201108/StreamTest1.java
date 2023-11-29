import java.util.*;

public class StreamTest1 {
    public static void main(String[] args) {
        BaseMaterial bm = new BaseMaterial();

        List<Integer> lint = bm.getIntArray(21);
        List<String> lstr = bm.getStrArray();
        
        // 1st forEach
        lint.forEach(x -> System.out.printf("%d, ", x));
        System.out.println("");

        // 2nd forEach
        lint.forEach(x -> {
            if (x % 3 == 0) {
                System.out.printf("%d, ", x);
            }
        });
        System.out.println("");

        // 3rd forEach
        lstr.forEach(s -> System.out.printf("%s, ", s));
        System.out.println("\n");

        /*
        // or ...
        lstr.forEach(System.out::println);
        System.out.println("");
        */

        // 4th forEach
        System.out.println("Strings with more than 8 chars:");
        lstr.stream().filter(s -> s.length() > 8).forEach(System.out::println);
        System.out.println("");

        // 5th forEach
        System.out.println("Strings with less than 6 chars:");
        lstr.stream().filter(s -> s.length() < 6).forEach(s -> System.out.printf("%s, ", s));
        System.out.println("");

    }
}