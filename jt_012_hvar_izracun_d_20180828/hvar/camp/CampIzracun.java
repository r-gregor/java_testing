package hvar.camp;
import hvar.camp.CampCene;

public class CampIzracun {
    public static double st_odrasli = 4;
    public static double st_otroci = 1;

    public static double sezona_dni = 20;
    public static double psezona_dni = 1;

    public static CampCene cmpc = new CampCene();
    // CampIzracun = new CampIzracun();

    public static double cenaOdrasli = st_odrasli * ((psezona_dni * cmpc.odrasli_psez) + (sezona_dni * cmpc.odrasli_sez));
    public static double cenaOtroci = st_otroci * ((psezona_dni * cmpc.otroci_psez) + (sezona_dni * cmpc.otroci_sez));
    public static double cenaCamp = ((psezona_dni + sezona_dni) * (cmpc.avto + cmpc.elektrika)) + (psezona_dni * cmpc.parcela_psez) + (sezona_dni * cmpc.parcela_sez);

    public static double cenaSkupaj = cenaOdrasli + cenaOtroci + cenaCamp;
    public static double HRK_to_EUR = 7.44;
    public static double cenaSkupaj_EUR = cenaSkupaj/HRK_to_EUR;

    public static void campIzracun() {
    	System.out.println("CAMP -- OTROCI = " + cenaOtroci + " HRK.");
    	System.out.println("CAMP -- ODRASLI = " + cenaOdrasli + " HRK.");
    	System.out.println("CAMP -- CAMP = " + cenaCamp + " HRK.");
        System.out.println("---------------------------------------------");
    	System.out.println("CAMP -- SKUPAJ = " + cenaSkupaj + " HRK. ["+cenaSkupaj_EUR+" EUR; 1 EUR = "+HRK_to_EUR+"]");
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {
        campIzracun();
    }
}
