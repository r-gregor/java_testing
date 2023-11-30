// V2

import java.util.*;

public class IzracunPovrsineZaBarvanjeCevi {

    public static Double premerVMetrih(final HashMap<Integer, Double> cevi, final Integer DN) {
        return cevi.get(DN) / 1000.0;
    }

    // final Map<Integer, Double> cevi = new HashMap<Integer, Double>();

    static void prikaziDimenzije(Map<Integer, Double> map) {
        for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            System.out.printf("%-6s zunanji premer = %.2f mm%n", "DN" + entry.getKey() + ":", entry.getValue());
        }
    }

    public static void main(final String[] args) {
        final Map<Integer, Double> cevi = new HashMap<Integer, Double>();
        cevi.put(15, 21.3);
        cevi.put(25, 23.7);
        cevi.put(40, 48.3);
        cevi.put(50, 60.3);
        cevi.put(65, 76.1);
        cevi.put(80, 88.9);
        cevi.put(100, 114.3);
        cevi.put(125, 139.7);
        cevi.put(150, 168.3);
        cevi.put(200, 219.1);
        cevi.put(250, 323.9);
        cevi.put(300, 273.0);
        cevi.put(350, 368.0);
        cevi.put(400, 419.0);
        cevi.put(300, 508.0);

        if (args.length == 2) {
            final Integer D = Integer.parseInt(args[0]);
            final Double L = Double.parseDouble(args[1]);
            final Double Ac = Math.PI * (cevi.get(D) / 1000) * L;
            System.out.println("-------------------------------------------------------------------------");
            System.out.printf("Površina cevi DN%d (fi %.1f), dolžine L = %.2f znaša: %.2f m2%n", D, cevi.get(D), L,  Ac);

        } else {
            prikaziDimenzije(cevi);
            System.out.println("Vnesi dimenzijo (DN) in dolžino L [m]!");
        }


    }
}