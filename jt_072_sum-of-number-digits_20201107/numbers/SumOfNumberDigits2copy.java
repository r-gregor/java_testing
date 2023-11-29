package numbers;

/**
 * Calculate the sum of individual digits of a number
 * compile time error if number is bigger than Integer.MAX_VALU (2^31 - 1 = 2147483647)
 * number is supplied as argument to SumOfNumberDigits3 command
 */
public class SumOfNumberDigits2copy {

    /**
     * Returns the sum of individual digits of a num. sum and num in long format type
     * exception message if num is bigger than Integer.MAX_VALU (2^31 - 1 = 2147483647)
     * @param num
     * @return
     */    
    public static int getSumOfDigits(String n) throws NumberFormatException {

        int sum = 0;
        double numd = Double.valueOf(n);

        //check for exception or return the sum
        if (numd > Integer.MAX_VALUE) {
            throw new NumberFormatException("Number too big for int type!");
        } else {
            int num = (int) numd;
            while (num > 0) {
                int toadd = num % 10;
                sum += toadd;
                num = num / 10;
            }
            return sum; 
        }
    }


    public static void main(String[] args) throws NumberFormatException {
        
        // check if argument is supplied
        if (args.length != 1) {
            System.out.println("Must supply an int as argument!");
            System.exit(1);
        } else {
            String n = args[0];
            System.out.printf("The sum of digits of number %s is: %d%n", n, getSumOfDigits(n));
        }

    }
}
