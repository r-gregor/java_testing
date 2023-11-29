import java.util.*;

/**
 * Mpika
 */
public class Mpika {

	private int znesek = 0;
	private int razlika = 0;

	private List<Integer> razred1 = Arrays.asList(250, 5);
	private List<Integer> razred2 = Arrays.asList(1250, 50);
	private List<Integer> razred3 = Arrays.asList(3500, 210);

	static void usage() {
		System.out.printf("\t" + "Usage: java Mpika [št. pik]%n%n");
	}

	private void mpikaInfo(int pike, List<Integer> razred, int vkratnik, int nznesek) {
		System.out.printf("razred: %d, vrednost: %d EUR%n", razred.get(0), razred.get(1));
		System.out.printf("pike: %d%n", pike);
		if (vkratnik != 0) {
			System.out.printf("razlika: %d - (%d * %d) = %d%n", pike, vkratnik, razred.get(0), razlika);
			System.out.printf("dodatek: %d * %d EUR = %d EUR%n", vkratnik, razred.get(1), nznesek);
			System.out.printf("znesek: %d EUR%n", znesek);
			System.out.println("---");
		} else {
			System.out.printf("dodatek: %d EUR%n", nznesek);
			System.out.printf("znesek: %d EUR%n", znesek);
			System.out.println("---");
		}
	}

	private void izracunPik(int pike, List<Integer> razred) {
		int vkratnik = pike / razred.get(0);
		int ostanek = pike % razred.get(0);
		int nznesek;
		if (vkratnik >= 1) {
			nznesek = vkratnik * razred.get(1);
			this.znesek += nznesek;
			this.razlika = ostanek;
		} else {
			nznesek = 0;
			this.razlika = pike;
		}
		mpikaInfo(pike, razred, vkratnik, nznesek);
	}

	private void koncniZnesek(int pike) {
		izracunPik(pike, this.razred3);
		izracunPik(this.razlika, this.razred2);
		izracunPik(this.razlika, this.razred1);
		System.out.printf("Končni znesek: %d EUR%n", this.znesek);
	}
	
	/** Main */
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(1);
		} else {
			Mpika mp = new Mpika();
			int pike = Integer.parseInt(args[0]);
			mp.koncniZnesek(pike);
		}
	}
}

