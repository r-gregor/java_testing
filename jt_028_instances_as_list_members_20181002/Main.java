/* testing getter setter and private members of classes
 * calling in main program from other classes trough use
 * of functions or parameterized constructors
 *
 *
 */

public class Main {

		// [N]ew [L]ine
		public static void NL() {
			System.out.print("\n");
		}

		// MAIN
		public static void main(String[] args) {
			Member M = new Member();
			M.setMembInfo("Mark", "Redelonghi", 19);
			M.getMembInfo();

			NL();
			Member Z = new Member();
			Z.setMembInfo("Zala", "Redelonghi", 22);
			Z.getMembInfo();

			NL();
			Member S = new Member("Spela", "Redelonghi", 10);
			S.getMembInfo();
	} // END MAIN

} //END class
