// filename: ZpHitrostPlina.java

class ZpHitrostPlina {

    double Qd;
    double Dz;
    double S;

    ZpHitrostPlina(double Qd, double Dz, double S) {
        this.Qd = Qd;
        this.Dz = Dz;
        this.S = S;
    }

    public static void main(String[] args) {
        String msg = "" +
        "Uporaba:\n" +
        "$> ZpHitrostPlina [Qd] [Dz] [S]\n" +
        "\n" +
	    "\tQd ... dejanski pretok [m3/h]\n" +
        "\tDz ... zunannji premer cevi [mm]\n" +
        "\tS  ... debelina stene cevi [mm]\n";

        if (args.length != 3) {
            System.out.println(msg);
            System.exit(1);
        }
        double Qd = Double.valueOf(args[0]);
        double Dz = Double.valueOf(args[1]);
        double S = Double.valueOf(args[2]);

        ZpHitrostPlina zpHP = new ZpHitrostPlina(Qd, Dz, S);

        zpHP.izracunHitrostiPlina();

    } // end main

    private void izracunHitrostiPlina() {
        double Dn;
        double w;
        Dn = (this.Dz - 2 * this.S) / 1000; // [m]
        w = (this.Qd * 4) / (3.1415927 * (Math.pow(Dn, 2)) * 3600);
    
        // fmt.Println("\nIzračun dejanskega pretoka zemeljskega plina");
        System.out.println("\n" + "Vhodni podatki:");
        System.out.printf("%-25s"+"%8.2f [m3/h]\n", "Dejanski pretok Qd:", Qd);
        System.out.printf("%-25s"+"%8.2f [mm]\n", "Premer cevi Dz:", Dz);
        System.out.printf("%-25s"+"%8.2f [mm]\n", "Debelna stene S:", S);
    
        System.out.println("-----------------------------------------");
    
        System.out.println("Izračun:");
        System.out.printf("%-25s"+"%8.2f [m/s]\n", "Hitrost plina w:", w);
        System.out.println("=========================================");
    }

} // end class
