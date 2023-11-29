import java.util.*;

public class StreamTest2 {
    public static void main(String[] args) {
        BaseMaterial bm2 = new BaseMaterial();
        Map<Integer, String> mAnimals = bm2.getAnimalsMap();
        
        // test
        // System.out.println(mAnimals);
        // {1=Jaguar, 2=Wolf, 3=Owl, 4=Horse, 5=Otter, 6=Shark, 7=King Cobra, 8=Whale, 9=Pangolin, 10=Bee}
        final String PRNTFMT1 = "%d=%s,";
        final String PRNTFMT2 = "%3d = %s%n";

        // 1st forEach
        System.out.println("Animal map (all):");
        mAnimals.forEach((key, value) -> System.out.printf(PRNTFMT1, key, value));
        System.out.println("\n");

        // 2nd forEach
        int n = 6;
        System.out.println("Animal names with more than "+n+" chars:");
        mAnimals.forEach((key,value) -> {
            if (value.length() > n) {
                System.out.printf(PRNTFMT2, key, value);
            }
        });
        System.out.println("");

        // 3rd forEach
        System.out.println("Map values with 4 > key > 9:");
        mAnimals.forEach((key,value) -> {
            if (key > 4 && key < 9) {
                System.out.printf(PRNTFMT2, key, value);
            }
        });
        System.out.println("");

        // 4th forEach
        System.out.println("Map values with key > 5:");

        // in one line
        mAnimals.forEach((key,value) -> { if (key > 5) { System.out.printf(PRNTFMT2, key, value); } });
        System.out.println("");

        // 5th forEach
        System.out.println("Animals whose name starts with W:");
        mAnimals.forEach((key,value) -> {
            if (value.startsWith("W")) {
                System.out.printf(PRNTFMT2, key, value);
            }
        });
        System.out.println("");
    }
}
