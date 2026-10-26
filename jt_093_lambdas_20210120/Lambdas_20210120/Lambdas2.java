import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Lambdas2
 */
public class Lambdas2 {

	public static void main(String[] args) {
		// List
		List<String> mList1 = Arrays.asList("Gregor", "Tadeja", "Zala", "Mark", "Špela");
		System.out.println("\n" + "[List].forEach(System.out::println) ...");
		mList1.forEach(System.out::println);

		System.out.println("\n" + "[List].stream().forEach(s -> System.out.println(\"The name is: \" + s) ...");
		mList1.stream().forEach(s -> System.out.println("The name is: " + s));

		// map
		Map<Integer, String> fml = new HashMap<>();
		fml.put(1, "Foter");
		fml.put(2, "Mat");
		fml.put(3, "Starejša hči");
		fml.put(4, "Sin");
		fml.put(5, "Mlajša hči");
		fml.put(6, "mačka");

		System.out.println("\n" + "[Map].forEach((k, v) -> System.out.println(\"Member \" + k + \" is: \" + v)) ...");
		fml.forEach((k, v) -> System.out.println("Member " + k + " is: " + v));

		System.out.println("\n"
				+ "[Map].entrySet().stream().forEach(e -> System.out.println(\"Member \" + e.getKey() + \" is: \" + e.getValue())) ...");
		fml.entrySet().stream().forEach(e -> System.out.println("Member " + e.getKey() + " is: " + e.getValue()));

	}
}

