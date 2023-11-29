public class Strings {
	// functions
	public static void EL() {
		System.out.println();
	}
	
	// MAIN
	public static void main(String[] args) {
		
		// contex 1 ------------------------------------------------------------------------------------------
		String str1 = "Gregor Redelonghi";
		int str1_len = str1.length();	// string length
		System.out.printf("Length of string str1: %d\n", str1_len);
		
		EL();
		// print position of each char in a string --> string.charAt(i) --> i = 0 .. string.length
		for (int i=0; i < str1_len; i++) {
				System.out.printf("%-3s", str1.charAt(i));
		}
		
		System.out.printf("\n");
		for (int i=0; i < str1_len; i++) {
				System.out.printf("%-3s", i+1);
		}
		
		// contex 2 ------------------------------------------------------------------------------------------
		EL();
		String abc_L = "abcdefghijklmnoprstuvz";
		String abc_U = "ABCDEFGHIJKLMNOPRSTUVZ";
		
		// convert string to array of chars
		char[] abc_chrs_L = abc_L.toCharArray();
		char[] abc_chrs_U = abc_U.toCharArray();
		
		// print position of each char in array --> array[i] --> i = 0 .. array.length
		for (int i=0; i < abc_chrs_L.length; i++) {
			System.out.printf("Char at position %d: %s\n", i+1, abc_chrs_L[i]);
		}
		
		EL();
		for (int i=0; i < abc_chrs_U.length; i++) {
			System.out.printf("Char at position %d: %s\n", i+1, abc_chrs_U[i]);
		}
		
	}
}
