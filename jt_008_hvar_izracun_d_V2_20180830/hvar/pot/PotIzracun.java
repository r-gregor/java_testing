package hvar.pot;
import hvar.pot.PotCene;

public class PotIzracun {

    public static double st_odrasli = 4;
    public static double st_otroci = 1;
    public static PotCene ptc = new PotCene();

    public static double pot_bencin = ptc.bencin;
    public static double pot_hac = ptc.hac_cena;
    public static double pot_jdrl_odrasli = ptc.jdrl_odrasli * st_odrasli;
    public static double pot_jdrl_otroci = ptc.jdrl_otroci * st_otroci;
    public static double pot_jdrl_avto = ptc.jdrl_avto;
    public static double pot_jdrl_prikolica = ptc.jdrl_prikolica;
    public static double pot_skupaj = pot_bencin + pot_hac + pot_jdrl_odrasli + pot_jdrl_otroci + pot_jdrl_avto + pot_jdrl_prikolica;
    public static double HRK_to_EUR = 7.44;
    public static double pot_skupaj_EUR = pot_skupaj/HRK_to_EUR;

    public static void potIzracun() {
    	System.out.printf("POT -- BENCIN = %.2f HRK. [%.2f HRK/L]\n", pot_bencin, hvar.pot.PotCene.bencin_cena);
		System.out.printf("POT -- AUTOC = %.2f HRK.\n", pot_hac);
		System.out.printf("POT -- OTROCI = %.2f HRK.\n", pot_jdrl_otroci);
		System.out.printf("POT -- ODRASLI = %.2f HRK.\n", pot_jdrl_odrasli);
		System.out.printf("POT -- AVTO = %.2f HRK.\n", pot_jdrl_avto);
		System.out.printf("POT -- PRIKOLICA = %.2f HRK.\n", pot_jdrl_prikolica);
    	System.out.println("------------------------------------------------------");
		System.out.printf("POT -- SKUPAJ = %.2f HRK. [%.2f EUR; 1 EUR = %.2f]\n", pot_skupaj, pot_skupaj_EUR, HRK_to_EUR);
        System.out.println("------------------------------------------------------");
    }

    public static void main(String[] args) {
    	potIzracun();
    }
}
