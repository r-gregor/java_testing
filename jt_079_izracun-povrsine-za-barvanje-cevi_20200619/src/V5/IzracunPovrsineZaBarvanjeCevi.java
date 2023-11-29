// V5

import java.util.*;

/**
 * Calculates area of a pipe from a "cevi" map for colouring
 * @version 1.0.5
 * @param   DN  nominal diameter (100 ,200, ...)
 * @param   l   the length of a pipe
 */
public class IzracunPovrsineZaBarvanjeCevi {

    /** a map of pipe dimensions: DN[m] --> external diameter [m] */
    final Map<Integer, Double> cevi = new HashMap<Integer, Double>();

    /** list of all DN-s for sorted output! */
    final List<Integer> dn_s = new ArrayList<Integer>(Arrays.asList(15,20,25,40,50,65,80,100,150,200,250,300,350,400,500));

    /** default constructor fills values to cevi map: DN [m] --> external diameter [m] 
     * HARDCODED!
    */
    IzracunPovrsineZaBarvanjeCevi() {
        this.cevi.put(15, 21.3);
        this.cevi.put(20, 26.9);
        this.cevi.put(25, 33.7);
        this.cevi.put(40, 48.3);
        this.cevi.put(50, 60.3);
        this.cevi.put(65, 76.1);
        this.cevi.put(80, 88.9);
        this.cevi.put(100, 114.3);
        this.cevi.put(125, 139.7);
        this.cevi.put(150, 168.3);
        this.cevi.put(200, 219.1);
        this.cevi.put(250, 323.9);
        this.cevi.put(300, 273.0);
        this.cevi.put(350, 368.0);
        this.cevi.put(400, 419.0);
        this.cevi.put(500, 508.0);
    }

    /** main method */
    public static void main(final String[] args) {

        final IzracunPovrsineZaBarvanjeCevi ic = new IzracunPovrsineZaBarvanjeCevi();

        if (args.length == 2) {
            final Integer D = Integer.parseInt(args[0]);
            final Double L = Double.parseDouble(args[1]);
            ic.povrsinaZaBarvanje(D, L);

        } else {
            ic.prikaziDimenzije2();
            System.out.println("Vnesi dimenzijo (DN) in dolžino L [m]!");
        }

    }

    /** Display all members of a "cevi" map [DN --> fi] 
     *
     * UNSORTED OUTPUT
     * 
    private void prikaziDimenzije() {
        for (final Map.Entry<Integer, Double> entry : cevi.entrySet()) {
            System.out.printf("%-6s zunanji premer = %.2f mm%n", "DN" + entry.getKey() + ":", entry.getValue());
        }
    }
    */

    /** Display all members of a "cevi" map [DN --> fi] 
     * SORTED OUTPUT
    */
    private void prikaziDimenzije2() {
        for (final Integer dn : dn_s) {
            System.out.printf("%-6s zunanji premer = %.2f mm%n", "DN" + dn + ":", cevi.get(dn));
        }
    }

    /** Calculate and display colouring area of lenght [m] and diameter[m] of pipe from "cevi" map 
     * @param   D   nominal diameter (100, 200, ...)
     * @param   L   length of pipe to be coloured [m]
    */
    private void povrsinaZaBarvanje(final Integer D, final Double L) {
        if (!cevi.containsKey(D)) {
            System.out.printf("Nominalni premer (DN)%d izven območja (15 - 300)!%n", D);
            return;
        }
    
        final Double Ac = Math.PI * (cevi.get(D) / 1000) * L;
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("Površina cevi DN%d (fi %.1f), dolžine L = %.2f znaša: %.2f m2%n", D, cevi.get(D), L, Ac);
    }

}
