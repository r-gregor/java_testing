import java.util.*;

public class TestNumsDisp2 {
       
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number in float format\n" +
                         "(use comma as decimal point on Windows!): ");
        double mynum = input.nextDouble();
        
        System.out.print("Enter number of digits after the decimal point: ");
        int dec = input.nextInt();
        
        
        NumsDisp3 nm = new NumsDisp3();

        double new_n = nm.num_with_n_decimals(mynum, dec);
        
        System.out.println("Original number is: " + mynum);
        System.out.println("New num is: " + new_n);

    }

}