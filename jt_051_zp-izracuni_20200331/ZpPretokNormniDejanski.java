// filename: ZpPretokNormniDejanski.java

class ZpPretokNormniDejanski {

    double QN;
    double Pd;

    ZpPretokNormniDejanski(double QN, double Pd) {
        this.QN = QN;
        this.Pd = Pd;
    }

    public static void main(String[] args) {
        String msg = "" +
        "Uporaba:\n" +
        "$> ZpPretokNormniDejanski [QN] [Pd]\n" +
        "\n" +
	    "\tQN ... normni pretok [Nm3/h]\n" +
	    "\tPd ... deloQNi tlak  [bar]\n";

        if (args.length != 2) {
            System.out.println(msg);
            System.exit(1);
        }
        double QN = Double.valueOf(args[0]);
        double Pd = Double.valueOf(args[1]);

        ZpPretokNormniDejanski zpND = new ZpPretokNormniDejanski(QN, Pd);

        zpND.izracunDehanskegaPretoka();

    } // end main

    private void izracunDehanskegaPretoka() {
        double T0 = 273.15;  // Normna temperatura [K]
        double P0 = 1.01325; // Normni tlak [bar]
        double Patm;
        // var Tz double64 = 279.15 // Računska temperatura - zunaj  (6°C) [K]
        double Tn = 288.15; // Računska temperatura - notri (15°C) [K]
    
        double H = 298.0; // povprečna nadmorska višina LJ = 298 m
        double fR;
        double Qd;
    
        Patm = 1016.0 - (0.12 * H);
        fR = (T0 / Tn) * (((Patm / 1000) + this.Pd) / P0);
        Qd = this.QN / fR;
    
        // fmt.Println("\nIzračun dejanskega pretoka zemeljskega plina")
        System.out.println("\n" + "Vhodni podatki:");
        System.out.printf("%-25s"+"%8.2f [bar]\n", "Delovni tlak Pd:", Pd);
        System.out.printf("%-25s"+"%8.2f [Nm3/h]\n", "Normni pretok QN:", QN);
    
        System.out.println("-----------------------------------------");
    
        System.out.println("Izračun:");
        System.out.printf("%-25s"+"%8.0f [mbar]\n", "Atmosferski tlak Patm:", Patm);
        System.out.printf("%-25s"+"%8.2f [-]\n", "Redukcijski faktor fR:", fR);
        System.out.printf("%-25s"+"%8.2f [m3/h]\n", "Dejanski pretok Qd:", Qd);
        System.out.println("=========================================");
    
    }

} // end class
