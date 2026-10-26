import java.util.*;

public class Lambdas {
	int count = 0;

	private void printMe(String... names) {
		for (String name : names) {
			System.out.println(name);
		}
	}

	private void prnt2(String el) {
		count++;
		System.out.println("Element " + count + ": " + el);
	}

	public static void main(String[] args) {

		Lambdas lm = new Lambdas();

		lm.printMe("Gregor", "Tadeja", "Zala");
		lm.printMe("100", "1000", "100.000,00", "22.02.2022", "1968", "1970");

		List<String> animals = List.of("Lion", "Zebra", "Giraffe", "Crocodile");

		animals.stream().forEach(el -> lm.prnt2(el));
		animals.stream().forEach(System.out::print);
		System.out.println();
	}

}
