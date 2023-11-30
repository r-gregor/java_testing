import java.util.*;

public class NumsDisp {
    double number;
    int dec_places;
    
    NumsDisp(double number, int dec_places) {
        this.number = number;
        this.dec_places = dec_places;
    }
   
    double num_with_n_decimals() {
        double exp = Math.pow(10.0, this.dec_places);
        double final_number = (int)(this.number * exp) / (double)exp;
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
        
        
        NumsDisp nm = new NumsDisp(mynum, dec);

        double new_n = nm.num_with_n_decimals();
        
        System.out.println("Original number is: " + mynum);
        System.out.println("New num is: " + new_n);

    }

}