package hvar.pot;

public class PotCene {
	public static double dist_cesta = 528;
	public static double bencin_na_stokm = 10;
	public static double bencin_cena = 10.330;
	public static double jdrl_odrasli = 47;
	public static double jdrl_otroci = 23.5;
	public static double jdrl_avto = 588;
	public static double jdrl_prikolica = 200;
	public static double hac_cena = 318;

	// izracuni:
	public static double bencin_poraba = bencin_na_stokm/100 * dist_cesta;
	public static double bencin = bencin_poraba * bencin_cena;

}
