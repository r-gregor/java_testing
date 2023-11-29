import java.lang.Math.*;

class Funcs_03 {
    
    // instance variables
    int pc_dim_d;
    float pc_dim_s;
    float pc_length;
    String pc_oznaka;
    String pc_mat;
    String pc_plevel;
    String pc_vodilna;
    int pc_sifra;
    
    // custom constructor
    Funcs_03(String vodilna, int sifra, int dim_d, float dim_s, float plength, String material) {
        this.pc_dim_d = dim_d;
        this.pc_dim_s = dim_s;
        this.pc_length = plength;
        this.pc_mat = material;
        // this.pc_plevel = level;
        this.pc_vodilna = vodilna;
        this.pc_sifra = sifra;
        
        if (pc_vodilna == "N") {
        pc_plevel = "Nizkotlačni";
        }
        else if (pc_vodilna == "S") {
            pc_plevel = "Srednjetlačni";
        }
        else if (pc_vodilna == "V") {
            pc_plevel = "Visokotlačni";
        }
    }

    // return Oznaka
    public String getOznaka() {
        String pc_D = Integer.toString(pc_dim_d);
        String pc_S = Float.toString(pc_dim_s);
        String ozn = pc_vodilna + "-" + Integer.toString(pc_sifra) + ", " + pc_mat + pc_D + "x" + pc_S + "/" + pc_plevel + "/dolžina L=" + pc_length + "m";
        return ozn;
    }
    
    // return Diameter
    public float getDiameter() {
        float D = pc_dim_d;
        return D;
    }
    
    // return length
    public float getLength() {
        float L = pc_length;
        return L;
    }
    
    public float getVolUmePerMeter(float diameter) {
        float D = diameter / 1000f;
        float mPI = (float)Math.PI;
        float area = (mPI * D * D) / 4f;
        float volume_per_m = area;
        return volume_per_m;
    }
    
    static public void crt() {
        System.out.println("\n----------------------------------------------------------------------------");
    }
    

    // MAIN
    public static void main(String[] args) {
        
        Funcs_03 Pln1 = new Funcs_03("N", 23900, 225, 13.4F, 115.5F, "PE");
        Funcs_03 Pln2 = new Funcs_03("S", 2360, 160, 9.5F, 424.85F, "PE");
        String ozn1 = Pln1.getOznaka();
        String ozn2 = Pln2.getOznaka();
        System.out.println("Oznaka plinovoda 1: " + ozn1);
        System.out.println("Oznaka plinovoda 2: " + ozn2);
        
        float Pl1_len = Pln1.getLength();
        System.out.println("Dolžina plinovoda P1: " + Pl1_len + "m.");
        
        float Pl2_len = Pln2.getLength();
        System.out.println("Dolžina plinovoda P2: " + Pl2_len + "m.");
        
        crt();
        float P1_vol_per_m = Pln1.getVolUmePerMeter(Pln1.getDiameter());
        System.out.println("Prost. na meter za plinovod - P1 = " + Float.toString(P1_vol_per_m) + " m3/m.");
        System.out.println("Prost. za plinovod - P1 = " + Float.toString(P1_vol_per_m * Pl1_len) + " m3.");
        
        crt();
        float P2_vol_per_m = Pln2.getVolUmePerMeter(Pln2.getDiameter());
        System.out.println("Prost. na meter za plinovod - P2 = " + Float.toString(P2_vol_per_m) + " m3/m.");
        System.out.println("Prost. za plinovod - P2 = " + Float.toString(P2_vol_per_m * Pl2_len) + " m3.");

    }

}