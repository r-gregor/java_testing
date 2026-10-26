// filename Padec3.java
import java.util.*;

public class Padec3 {
    
    double start_p;
    double end_p;
    double h_dist;
    final double mpadec = 0.003;
    String mpadec_prcnt = (mpadec * 100) + "%";
    
    /** default non-parameterized constructor */
    Padec3 () {
    }
    
    /** parameterized constructor */
    Padec3(double start_p, double end_p, double h_dist) {
        this.start_p = start_p;
        this.end_p = end_p;
        this.h_dist = h_dist;
    }


    // FUNCTIONS ---------------------------------------------------------------------------------------------
    /** function padec returns naklon */
    public double padec() {
        double v_dist = this.end_p - this.start_p;
        double naklon = v_dist / this.h_dist;
        return naklon;
    }
    
    /** function padec_pr returns String padec that represents naklon in percentage */
    public String padec_pr(double naklon) {
        double padec_ratio = naklon * 100;
        // 
        String padec_pr = String.format("%.3f", padec_ratio);
        return padec_pr;
    }
    
    /** function to get parameters from user */
    public static String[] padec_ask() {
        String[] params = new String[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Vstavi visino zacetne tocke, visino koncne tocke in horizontalno razdaljo: ");
        params[0] = input.next();
        params[1] = input.next();
        params[2] = input.next();
        
        return params;
    }
    
    /** function to caclculate new end point if inclination below 0.3%*/
    public void calculate_endp() {
        double end_p_new = 0.0;
        double vdist_n = this.mpadec * this.h_dist;
        
        if (this.start_p > this.end_p) {
            end_p_new = this.start_p - vdist_n;
            System.out.printf("Visina koncne tocke za padec vsaj %s mora biti: %.2f m ali manj.%n", mpadec_prcnt, end_p_new);
        } else {
            end_p_new = this.start_p + vdist_n;
            System.out.printf("Visina koncne tocke za padec vsaj %s mora biti: %.2f m ali vec.%n", mpadec_prcnt, end_p_new);
        }
    }
    
    // FUNCTIONS ---------------------------------------------------------------------------------------------


} // end class
