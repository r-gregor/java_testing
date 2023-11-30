import java.util.*;

public class NumsDisp3 {
   
    double num_with_n_decimals(double number, int dec_places) {
        double exp = Math.pow(10.0, dec_places);
        double final_number = (int)(number * exp) / (double)exp;
        return final_number;
    }
    
}
