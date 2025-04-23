// filename: ZpDimCeviPretokHitrost.java

import java.util.ArrayList;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class ZpDimCeviPretokHitrost {
    double Qd;
    double maxw;

    ZpDimCeviPretokHitrost(double Qd, double maxw) {
        this.Qd = Qd;
        this.maxw = maxw;
    }

    public static void main(String[] args) {
        String msg = "" +
        "Uporaba:\n" +
        "$> ZpDimCeviPretokHitrost [Qd] maxw]\n" +
        "\n" +
	    "\tQd ..... dejanski pretok [m3/h]\n" +
	    "\tmaxw ... max hitrost ZP  [m/s]\n";

        if (args.length != 2) {
            System.out.println(msg);
            System.exit(1);
        } else {
        double Qd = Double.valueOf(args[0]);
        double maxw = Double.valueOf(args[1]);
        
        ZpDimCeviPretokHitrost zpDC = new ZpDimCeviPretokHitrost(Qd, maxw);
    
        System.out.printf("Pretok: %.2f m3/h\n", Qd);
        zpDC.izracun(Qd, maxw);
        } // end if

    } // end main

    // izračun hitrosti glede na pretok in presek
    private double hitrost(double Qd, double A) {
        double w = Qd / (A * 3600);
        return w;
    }

    // izračun preseka glede na dimenzije cevi
    private double povrsina(double Dz, double S) {
        double Dn = Dz - 2 * S;
        double Ac = (3.1415927 * Math.pow(Dn, 2)) / 4;
        return Ac;
    }

    private void izracun(double pretok, double maxw) {

        Map <Double, Cev> cevi = new HashMap<Double, Cev>();
        // cevi[33.7] = new Cev("DN25", [}double{3.25, 3.6});
        cevi.put(33.7, new Cev("DN25", new ArrayList<Double>(Arrays.asList(3.25, 3.6))));
        cevi.put(42.4, new Cev("DN40", new ArrayList<Double>(Arrays.asList(3.25, 3.6))));
        cevi.put(60.3, new Cev("DN50", new ArrayList<Double>(Arrays.asList(3.2, 3.6, 4.0, 4.5))));
        cevi.put(88.9, new Cev("DN80", new ArrayList<Double>(Arrays.asList(3.2, 3.6, 4.0, 4.5))));
        cevi.put(114.3, new Cev("DN100", new ArrayList<Double>(Arrays.asList(3.6, 4.0, 4.5, 5.0))));
        cevi.put(168.3, new Cev("DN150", new ArrayList<Double>(Arrays.asList(3.6, 4.0, 4.5, 5.0))));
        cevi.put(219.1, new Cev("DN200", new ArrayList<Double>(Arrays.asList(4.0, 4.5, 5.0, 5.6))));
        cevi.put(273.0, new Cev("DN250", new ArrayList<Double>(Arrays.asList(4.0, 4.5, 5.0, 5.6))));
        cevi.put(323.9, new Cev("DN300", new ArrayList<Double>(Arrays.asList(4.0, 4.5, 5.0, 5.6))));

        double Qd = pretok;
        double razlika = maxw;
        String zmagovalec = "";
    
        for (Map.Entry<Double, Cev> el : cevi.entrySet()) {
            double k = el.getKey();
            String Ozn = el.getValue().ozn;

            for (double ds : el.getValue().cev) {
                double A = povrsina(k, ds);
                double Am = A / (Math.pow(1000, 2));
                double w = hitrost(Qd, Am);
    
                if (w < maxw) {
                    // izbere tistega znagovalca pri katerem je razlika najmanša!
                    if (maxw-w < razlika) {
                        razlika = maxw - w;
                        zmagovalec = String.format(" --> Izbrana cev: %.1fx%.1f (%s), hitrost: %.3f m/s", k, ds, Ozn, w);
                    }
                } else {
                    continue;
                } // end if
            } // end for
        } // end for

        String S1 = String.format("Max hitrost: %.1f m/s", maxw);
        System.out.printf("%-22s%s\n", S1, zmagovalec);
    }

} // end class

class Cev {
    String ozn;
    ArrayList<Double> cev;

    Cev(String ozn, ArrayList<Double> cev) {
        this.ozn = ozn;
        this.cev = cev;
    }
} // end class

