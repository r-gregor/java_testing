package hvar;
import hvar.camp.*;
import hvar.pot.*;

public class HvarIzracun {
	public static void cls() {
		System.out.print("\033[H\033[2J");
	}

	public static void main(String[] args) {
		cls();
		System.out.println("Hvar - izracun stroskov:\n");
		PotIzracun pi = new PotIzracun();
		CampIzracun ci = new CampIzracun();
		double total = (pi.pot_skupaj * 2) + ci.cenaSkupaj;
		double HRK_to_EUR = 7.44;
		double total_EUR = total/HRK_to_EUR;
		pi.potIzracun();
		System.out.println();
		ci.campIzracun();
		System.out.println();
		System.out.println("==============================================================================");
		System.out.println("TOTAL = POT x2 + CAMP:");
		System.out.printf("TOTAL = %.2f HRK. [%.2f EUR; 1 EUR = %.2f]\n", total, total_EUR, HRK_to_EUR);
		System.out.println("==============================================================================");
	}
}
