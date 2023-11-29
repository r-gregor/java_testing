package declarative;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;


public class DeclarativeApproach {
    public static void main(String[] args) {
        List<String> bojz = new ArrayList<>();
        bojz.add("Gregec");
        bojz.add("Markec");
        bojz.add("Matic");
        bojz.add("Luka");
        bojz.add("Max");

        // java 8 and higher: functional programming
        bojz.forEach(System.out::println);

        Function<Integer, Integer> addOne = number -> number + 1;
        Function<Integer, Integer> multipyByTen = number -> number * 10;
        BiFunction<Integer, Integer, Integer> doAll = (number, factor) -> (number +1) * factor;

        // functional
        System.out.println(addOne.apply(50));
        System.out.println(multipyByTen.apply(5));

        // functional - combined
        System.out.println(addOne.andThen(multipyByTen).apply(2));

        // biFunctional
        System.out.println(doAll.apply(8, 10));

        
    }
    
}
