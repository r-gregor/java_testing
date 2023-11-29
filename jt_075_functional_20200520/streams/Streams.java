package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] main) {
		List<String> seznam = List.of("Gregec", "Mark", "Matic", "Mark", "Luka", "Maks", "Mark");

		System.out.println("--- Natural order:");
		seznam.stream().forEach(System.out::println);

		System.out.println("--- Sorted:");
		seznam.stream().sorted().forEach(System.out::println);

		System.out.println("--- Sorted SET:");
		seznam.stream().sorted().collect(Collectors.toSet()).forEach(System.out::println);

	}
}
