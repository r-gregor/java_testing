// filename: Arrays2.java

import java.util.*;
import java.util.Arrays;

public class Arrays2 {
	List<String> list2 = Arrays.asList("ena", "dva", "tri", "stiri", "pet", "sest", "sedem", "osem", "devet", "deset");

	public void displayArray2() {
		int size2 = this.list2.size();
		System.out.println("\n" + "Displaying the array of size " + size2);
		for (String e2: this.list2) {
			System.out.printf("%12s%n", e2);
		}
	}

}

