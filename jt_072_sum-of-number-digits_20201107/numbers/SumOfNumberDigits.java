package numbers;

/**
 * Calculate the sum of individual digits of a number
 * compile time error if number is bigger than Integer.MAX_VALU (2^31 - 1 = 2147483647)
 * number is supplied in main (testing)
 */
public class SumOfNumberDigits {

    /**
     * Returns the sum of individual digits of a num. sum and num in long format type
     * exception if num is bigger than Integer.MAX_VALU (2^31 - 1 = 2147483647)
     * @param num
     * @return
     */
	public static int getSumOfDigits(int num) {

        int sum = 0;

        // return -1 if num to big
        if (num > Integer.MAX_VALUE) {
            System.out.println("Number too big for int type!");
            return -1;
        }
    
        // else add digits to sum and return sum
        while (num > 0) {
            int toadd = num % 10;
            sum += toadd;
            num = num / 10;
        }
        return sum;     
    }

    public static void main(String[] args) {
        try {
            int n = 999999999;
            System.out.printf("The sum of digits of number %d is: %d%n", n, getSumOfDigits(n));
        } catch(Exception m) {
            System.out.println("m");
        }
    }
}
