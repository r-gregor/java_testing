// filename Padec6.java
import java.util.*;

public class Padec6 {
    
    double start_p;
    double end_p;
    double h_dist;
    double v_dist;
    final double mpadec = 0.003;
    String mpadec_prcnt = (mpadec * 100) + "%";
    
    /** default non-parameterized constructor */
    Padec6 () {
    }
    
    /** parameterized constructor */
    Padec6(double start_p, double end_p, double h_dist) {
        this.start_p = start_p;
        this.end_p = end_p;
        this.h_dist = h_dist;
    }


    // FUNCTIONS ---------------------------------------------------------------------------------------------
    /** function padec returns naklon */
    public double padec() {
        this.v_dist = this.end_p - this.start_p;
        double naklon = this.v_dist / this.h_dist;
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
        double end_p_up = 0.0;
        double end_p_down = 0.0;
        double vdist_n = this.mpadec * this.h_dist;
        
        end_p_up = this.start_p + vdist_n;
        end_p_down = this.start_p - vdist_n;
        System.out.printf("Visina koncne tocke za padec vsaj %s mora biti:%n" +
                            "\t(+) %.3f m ali vec.%n", mpadec_prcnt, end_p_up);
        System.out.printf(  "\t(-) %.3f m ali manj.%n", end_p_down);
        System.out.printf("Vertikalna razdalja mora biti vsaj: (+/-) %.3f m ali vec.%n", vdist_n);
        
    }
    
    // FUNCTIONS ---------------------------------------------------------------------------------------------


} // end class
