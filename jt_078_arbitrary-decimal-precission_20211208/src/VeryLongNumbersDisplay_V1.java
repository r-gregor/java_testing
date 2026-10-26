import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.BigInteger;


public class VeryLongNumbersDisplay_V1 {

	public static void main(String[] argv) {
		
		double dividend = 6.0;
		double divizor = 7.0;

		double result = dividend / divizor;

	
		BigDecimal dvdnt = new BigDecimal(String.valueOf(dividend));
		BigDecimal dvzr  = new BigDecimal(String.valueOf(divizor));
		
		BigDecimal big_result_20 = dvdnt.divide(dvzr, 20, RoundingMode.HALF_EVEN);
		BigDecimal big_result_40 = dvdnt.divide(dvzr, 40, RoundingMode.HALF_EVEN);


		System.out.println("--- displaying as double ---");
		System.out.printf("The result of 1/3 with 14 decimal digits = %.14f\n", result);
		System.out.printf("The result of 1/3 with 15 decimal digits = %.15f\n", result);
		System.out.printf("The result of 1/3 with 16 decimal digits = %.16f\n", result);
		System.out.printf("The result of 1/3 with 17 decimal digits = %.17f\n", result);
		System.out.printf("The result of 1/3 with 20 decimal digits = %.20f\n", result);
		System.out.println("=================================================================");
		System.out.println("--- displaying as BigDecimal ---");
		System.out.printf("The result of 1/3 with 20 decimal digits = %.20f\n", big_result_20);
		System.out.printf("The result of 1/3 with 40 decimal digits = %.40f\n", big_result_40);

	}

}

