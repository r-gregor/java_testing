import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.BigInteger;

public class VeryLongNumbersDisplay_V6 {

public static void displayVeryLongQuotient(int mydividend, int mydivizor) {

	double dividend = mydividend;
	double divizor = mydivizor;

	double result = dividend / divizor;

	BigDecimal dvdnt = new BigDecimal(String.valueOf(dividend));
	BigDecimal dvzr  = new BigDecimal(String.valueOf(divizor));
	
	BigDecimal big_result_60 = dvdnt.divide(dvzr, 60, RoundingMode.HALF_EVEN);

	System.out.println("--- displaying as BigDecimal ---");
	System.out.printf("The result of %d/%d with 60 decimal digits:\n%.60f\n", mydividend, mydivizor, big_result_60);
}

	public static void main(String[] argv) {
		// PI accurate to the 7-th digit
		displayVeryLongQuotient(355, 113);
		System.out.println("3.141592653589793238462643383279502884197169399375105820974944 <-- Pi to the 60 decimal places\n" +
							"(from: https://decimal.info/digits-of-pi/value-of-pi-to-59-decimal-places.html)");
	}
} 

