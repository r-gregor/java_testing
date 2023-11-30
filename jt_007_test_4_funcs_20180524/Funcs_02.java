import java.lang.Math.*;

class Funcs_02 {
    
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
    Funcs_02(String vodilna, int sifra, int dim_d, float dim_s, float plength, String material) {
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

    // MAIN
    public static void main(String[] args) {
        
        Funcs_02 Pln1 = new Funcs_02("N", 23900, 225, 13.4F, 115.5F, "PE");
        Funcs_02 Pln2 = new Funcs_02("S", 2360, 160, 9.5F, 424.85F, "PE");
        String ozn1 = Pln1.getOznaka();
        String ozn2 = Pln2.getOznaka();
        System.out.println("Oznaka plinovoda 1: " + ozn1);
        System.out.println("Oznaka plinovoda 2: " + ozn2);


    }

}