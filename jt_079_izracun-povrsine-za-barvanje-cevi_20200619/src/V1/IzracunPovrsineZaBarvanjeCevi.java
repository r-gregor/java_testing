import java.util.*;

public class IzracunPovrsineZaBarvanjeCevi {

    public static Double premerVMetrih(final HashMap<Integer, Double> cevi, final Integer DN) {
        return cevi.get(DN) / 1000.0;
    }

    

    public static void main(final String[] args) {
        final Map<Integer, Double> cevi = new HashMap<Integer, Double>();
        cevi.put(25, 23.7);
        cevi.put(50, 60.3);
        cevi.put(80, 88.9);
        cevi.put(100, 114.3);
        cevi.put(150, 168.3);
        cevi.put(200, 219.1);
        cevi.put(250, 273.0);

        for (final Map.Entry<Integer, Double> entry : cevi.entrySet()) {
            System.out.printf("DN%d: zunanji premer = %.2f mm%n", entry.getKey(), entry.getValue());
        }

        if (args.length == 2) {
            final Integer D = Integer.parseInt(args[0]);
            final Double L = Double.parseDouble(args[1]);
            final Double Ac = Math.PI * (cevi.get(D) / 1000) * L;
            System.out.println("-------------------------------------------------------------------------");
            System.out.printf("Površina cevi DN%d (fi %.1f), dolžine L = %.2f znaša: %.2f m2%n", D, cevi.get(D), L,  Ac);

        } else {
            System.out.println("Vnesi dimenzijo (DN) in dolžino L [m]!");
        }


    }
}