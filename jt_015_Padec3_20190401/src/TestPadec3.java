// filename: TestPadec3.java
import java.util.*;

public class TestPadec3 {
    // MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN
    /** main method */
    public static void main(String[] args) {
        System.out.println("[ Padec3 ] -- izracun padca");
        double start_p;
        double end_p;
        double h_dist;
        
        // if parameters to command supplied
        if (args.length == 3) {
            start_p = Double.parseDouble(args[0]);
            end_p = Double.parseDouble(args[1]);
            h_dist = Double.parseDouble(args[2]);

        // else ask for them --> function: padec_ask
        } else {
            String[] my_params = Padec3.padec_ask();
            start_p = Double.parseDouble(my_params[0]);
            end_p = Double.parseDouble(my_params[1]);
            h_dist = Double.parseDouble(my_params[2]);
        }
        
        Padec3 pdc1 = new Padec3(start_p, end_p, h_dist);
        double my_padec = pdc1.padec();
        String my_naklon = pdc1.padec_pr(my_padec);

        System.out.printf("%n" + "Zacetna tocka: = %.2f m%n", start_p);
        System.out.printf("Koncna tocka: = %.2f m%n", end_p);
        System.out.printf("Horizontalna razdalja: = %.2f m%n", h_dist);
        System.out.println("-------------------------------------");
        System.out.printf("Padec = %s %%%n", my_naklon);
        
    if (Math.abs(my_padec) < 0.003) {
        System.out.println("\n" + "Padec je manjsi od 0.3%");
        pdc1.calculate_endp();
    }
        
    } // end main
    // MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN
    
    
} // end class

