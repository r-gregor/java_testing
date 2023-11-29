package numbers;

/**
 * Calculate the sum of individual digits of a number
 * compile time error if number is bigger than Integer.MAX_VALU (2^31 - 1 = 2147483647)
 * number is supplied as argument to SumOfNumberDigits3 command
 */
public class SumOfNumberDigits3 {

    /**
     * Returns the sum of individual digits of a num. sum and num in long format type
     * custom error message if num is bigger than Integer.MAX_VALU (2^31 - 1 = 2147483647)
     * @param num
     * @return
     */
    public static long getSumOfDigits(String n) {

        long sum = 0;
        long num = Long.parseLong(n);

        // custom error message and return -1 if num to big or else return the sum
        if (num > Integer.MAX_VALUE) {
            System.out.println("Number too big for int type!");
            return -1;
        } else {
            while (num > 0) {
                long toadd = num % 10;
                sum += toadd;
                num = num / 10;
            }
            return sum;
        }
    }


    public static void main(String[] args) {

        // check if argument is supplied
        if (args.length != 1) {
            System.out.println("Must supply an int as argument!");
            System.exit(1);
        } else {        
            String n = args[0];
            long mynum = getSumOfDigits(n);

            if (mynum != -1) {
                System.out.printf("The sum of digits of number %s is: %d%n", n, getSumOfDigits(n));
            }
        }
    }
}
