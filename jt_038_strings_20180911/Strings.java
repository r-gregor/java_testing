
public class Strings {

	public static void EL() {
		System.out.println();
	}


	public static void main(String[] args) {

		String start_s = "Just a simple Start.";
		String add1_s = "You need just that!";
		String abcd = "abcdefghijklmnoprstuvzABCDEFGHIJKLMNOPRSTUVZ";
		int num1 = 1500;
		float fnum2 = 1500.22F;

		String majnum1 = "1800";
		String fmajnum2 ="3.141592678";

		EL();
		// converting int to String:
		//	new Integer(int) --> creating Integer object from primitive int
		String new_num1 = new Integer(num1).toString();
		System.out.println("Number converted to string: " + new_num1);

		// converting String ti int:
		int new_majnum1 = Integer.parseInt(majnum1);
		Integer NN = new Integer(new_majnum1);
		System.out.println("String converted to int: " + NN.toString());

		System.out.println("TEST: ");
		int sum1 = num1 + new_majnum1;
		System.out.printf("%d + %d = %d\n", num1, new_majnum1, sum1);

		EL();
		// for loop: print each character of string
		for (int i = 0; i<abcd.length(); i++) {
			System.out.printf("%-4s", abcd.charAt(i));
		}

		// for loop: print index of each character of string
		System.out.print("\n");
		for (int i = 0; i<abcd.length(); i++) {
			System.out.printf("%-4d", i);
		}
		System.out.print("\n");

		EL();
		// substring (from, to + 1):
		String subs = abcd.substring(15,35);
		System.out.println("Substring from 15 to 35 of abcd is:\n" + subs);


		EL();
		// for loop: print each character of string
		for (int i = 15; i<35; i++) {
			System.out.printf("%-4s", abcd.charAt(i));
		}

		// for loop: print index of each character of string
		System.out.print("\n");
		for (int i = 15; i<35; i++) {
			System.out.printf("%-4d", i);
		}
		System.out.print("\n");

	}
}
