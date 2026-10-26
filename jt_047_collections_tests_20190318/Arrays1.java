// filename: Arrays1.java

import java.util.*;

public class Arrays1 {
	List<String> list1 = new ArrayList<>();
	
	public void createArray1(int num) {
		// classic way ...
		for (int i = 0; i < num; i++) {
			this.list1.add("element " + (i + 1));
		}
	}
	

	public void displayArray1() {
		int size1 = this.list1.size();
		System.out.println("Displaying the array of size " + size1);
		for (String e1: this.list1) {
			System.out.printf("%12s%n", e1);
		}
	}

}
