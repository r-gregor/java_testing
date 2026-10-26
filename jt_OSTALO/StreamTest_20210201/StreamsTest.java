import java.util.*;

public class StreamsTest {
	public static void main(String[] args) {
		
		List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		// print all elements:
		// nums1.forEach(System.out::println);

		// print nums > 4
		nums1.stream()
			.filter(n -> n > 4)
			.forEach(System.out::println);

	}
}

