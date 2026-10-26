import org.paukov.combinatorics3.*;

public class Combinatorics {
    public static void main(String[] args) {
        Generator.combination("red", "black", "white", "green", "blue")
        .simple(3)
        .stream()
        .forEach(System.out::println);
    }
}

