import java.util.*;

public class NumsDisp2 {
   
    double num_with_n_decimals(double number, int dec_places) {
        double exp = Math.pow(10.0, dec_places);
        double final_number = (int)(number * exp) / (double)exp;
        return final_number;
    }
    
    public static void main(String[] args) {
        // double mynum = 198.123456789;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number in float format\n" +
                         "(use comma as decimal point on Windows!): ");
        double mynum = input.nextDouble();
        
        System.out.print("Enter number of digits after the decimal point: ");
        int dec = input.nextInt();
        
        
        NumsDisp2 nm = new NumsDisp2();

        double new_n = nm.num_with_n_decimals(mynum, dec);
        
        System.out.println("Original number is: " + mynum);
        System.out.println("New num is: " + new_n);

    }

}