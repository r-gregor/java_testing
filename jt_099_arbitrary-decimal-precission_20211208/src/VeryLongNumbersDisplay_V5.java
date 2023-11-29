import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.BigInteger;

public class VeryLongNumbersDisplay_V5 {

public static void displayVeryLongQuotient(int mydividend, int mydivizor) {

	double dividend = mydividend;
	double divizor = mydivizor;

	double result = dividend / divizor;

	BigDecimal dvdnt = new BigDecimal(String.valueOf(dividend));
	BigDecimal dvzr  = new BigDecimal(String.valueOf(divizor));
	
	BigDecimal big_result_20 = dvdnt.divide(dvzr, 20, RoundingMode.HALF_EVEN);
	BigDecimal big_result_40 = dvdnt.divide(dvzr, 40, RoundingMode.HALF_EVEN);
	BigDecimal big_result_60 = dvdnt.divide(dvzr, 60, RoundingMode.HALF_EVEN);

	System.out.println("--- displaying as BigDecimal ---");
	System.out.printf("The result of %d/%d with 20 decimal digits = %.20f\n", mydividend, mydivizor, big_result_20);
	System.out.printf("The result of %d/%d with 40 decimal digits = %.40f\n", mydividend, mydivizor, big_result_40);
	System.out.printf("The result of %d/%d with 60 decimal digits = %.60f\n", mydividend, mydivizor, big_result_60);
}

	public static void main(String[] argv) {
		// PI accurate to the 7-th digit
		displayVeryLongQuotient(355, 113);
	}
} 

