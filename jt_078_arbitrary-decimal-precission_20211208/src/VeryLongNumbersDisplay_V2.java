import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.BigInteger;



public class VeryLongNumbersDisplay_V2 {

public static void displayVeryLongNumber(int mydividend, int mydivizor) {

	double dividend = mydividend;
	double divizor = mydivizor;

	double result = dividend / divizor;


	BigDecimal dvdnt = new BigDecimal(String.valueOf(dividend));
	BigDecimal dvzr  = new BigDecimal(String.valueOf(divizor));
	
	BigDecimal big_result_20 = dvdnt.divide(dvzr, 20, RoundingMode.HALF_EVEN);
	BigDecimal big_result_40 = dvdnt.divide(dvzr, 40, RoundingMode.HALF_EVEN);


	System.out.println("--- displaying as double ---");
	System.out.printf("The result of %d/%d with 14 decimal digits = %.14f\n", mydividend, mydivizor, result);
	System.out.printf("The result of %d/%d with 15 decimal digits = %.15f\n", mydividend, mydivizor, result);
	System.out.printf("The result of %d/%d with 16 decimal digits = %.16f\n", mydividend, mydivizor, result);
	System.out.printf("The result of %d/%d with 17 decimal digits = %.17f\n", mydividend, mydivizor, result);
	System.out.printf("The result of %d/%d with 20 decimal digits = %.20f\n", mydividend, mydivizor, result);
	System.out.println("-----------------------------------------------------------------");
	System.out.println("--- displaying as BigDecimal ---");
	System.out.printf("The result of %d/%d with 20 decimal digits = %.20f\n", mydividend, mydivizor, big_result_20);
	System.out.printf("The result of %d/%d with 40 decimal digits = %.40f\n", mydividend, mydivizor, big_result_40);
	System.out.println("=================================================================");

}

	public static void main(String[] argv) {
		displayVeryLongNumber(1, 3);
		displayVeryLongNumber(6, 7);
		displayVeryLongNumber(7, 9);

		// PI accurate to the ?-th digit
		displayVeryLongNumber(22, 7);
		
		// PI accurate to the 7-th digit
		displayVeryLongNumber(355, 113);
	}
} 
