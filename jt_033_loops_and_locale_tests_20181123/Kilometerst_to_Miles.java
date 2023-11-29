public class Kilometerst_to_Miles {
	
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
		"Page 192, Chapter 5: Loops, Programming Excersizes: 5.6\n"
		);
		
		int Nc = 4 + 11 + 11 + 11 + 13;
		System.out.printf("%-13s%7s  |  %-10s%10s%n", "Kilometres", "Miles", "Miles", "Kilometres");
		// System.out.println("--------------------------");
		crtc(Nc);
		float kms_2 = 20F;
		float miles_1 = 1F;
		for (int miles = 1; miles < 11; miles += 1) {
			float kms_1 = 1.609F * miles_1;
			float miles_2 = (1F/1.609F) * kms_2;
			
			if (miles == 3) System.out.println("\n...\n");
			
			if (miles < 3 || miles > 8) {
				System.out.printf("%-13.0f%7.3f  |  %-10.0f%10.3f%n", miles_1, kms_1, kms_2, miles_2);
			}
			miles_1 += 1;
			kms_2 += 5;
			
		} //end for
	} //end main
	
} // end class