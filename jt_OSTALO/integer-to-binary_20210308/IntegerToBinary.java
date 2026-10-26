import java.util.*;

public class IntegerToBinary {

	public static void main(String[] args) {
		for (int i = 0; i < 1024; i++) {
			String i2 = Integer.toBinaryString(i);
			System.out.printf(	"%-8d%08d%n",
								i,
								Integer.valueOf(i2));
		}
	}
}
