// V4

import java.util.*;

public class IzracunPovrsineZaBarvanjeCevi {

    final Map<Integer, Double> cevi = new HashMap<Integer, Double>();

    private void prikaziDimenzije() {
        for (Map.Entry<Integer, Double> entry : cevi.entrySet()) {
            System.out.printf("%-6s zunanji premer = %.2f mm%n", "DN" + entry.getKey() + ":", entry.getValue());
        }
    }

    private void povrsinaZaBarvanje(Integer D, Double L) {
        final Double Ac = Math.PI * (cevi.get(D) / 1000) * L;
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("Površina cevi DN%d (fi %.1f), dolžine L = %.2f znaša: %.2f m2%n", D, cevi.get(D), L,  Ac);
    }

    public static void main(final String[] args) {

        IzracunPovrsineZaBarvanjeCevi ic = new IzracunPovrsineZaBarvanjeCevi();

        ic.cevi.put(15, 21.3);
        ic.cevi.put(25, 23.7);
        ic.cevi.put(40, 48.3);
        ic.cevi.put(50, 60.3);
        ic.cevi.put(65, 76.1);
        ic.cevi.put(80, 88.9);
        ic.cevi.put(100, 114.3);
        ic.cevi.put(125, 139.7);
        ic.cevi.put(150, 168.3);
        ic.cevi.put(200, 219.1);
        ic.cevi.put(250, 323.9);
        ic.cevi.put(300, 273.0);
        ic.cevi.put(350, 368.0);
        ic.cevi.put(400, 419.0);
        ic.cevi.put(300, 508.0);

        if (args.length == 2) {
            final Integer D = Integer.parseInt(args[0]);
            final Double L = Double.parseDouble(args[1]);
            ic.povrsinaZaBarvanje(D, L);

        } else {
            ic.prikaziDimenzije();
            System.out.println("Vnesi dimenzijo (DN) in dolžino L [m]!");
        }


    }
}