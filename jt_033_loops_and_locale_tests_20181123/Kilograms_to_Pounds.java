public class Kilograms_to_Pounds {
	
	public static void crtc(int n) {
		n = 5 + 13 + 10 + 7 + 10;
		for (int i = 1; i < n + 1; i++) {
			System.out.print("-");
		} // end for
		System.out.println();
	} // end crtc
		
	// MAIN
	public static void main(String[] args) {
		
		System.out.println(
		"From \"Introduction to JAVA programming\",\n" +
		"Page 192, Chapter 5: Loops, Programming Excersizes: 5.5\n"
		);
		
		int Nc = 4 + 11 + 11 + 11 + 13;
		System.out.printf("%-13s%7s  |  %-10s%10s%n", "Kilograms", "Pounds", "Pounds", "Kilograms");
		// System.out.println("--------------------------");
		crtc(Nc);
		float pnd2 = 20F;
		float kg1 = 1F;
		for (int kgs = 1; kgs < 201; kgs += 2) {
			float pnd1 = 2.2F * kg1;
			float kg2 = (1F/2.2F) * pnd2;
			
			if (kgs == 15) System.out.println("\n...\n");
			
			if (kgs < 15 || kgs > 180) {
				System.out.printf("%-13.0f%7.2f  |  %-10.2f%10.2f%n", kg1, pnd1, pnd2, kg2);
			}
			kg1 += 2;
			pnd2 += 5;
			
		} //end for
	} //end main
	
} // end class