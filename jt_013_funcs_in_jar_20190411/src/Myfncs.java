import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Myfncs {
	// global variables:
	public static String self_name = System.getProperty("sun.java.command");


	//	crtice: print "-" N times in a row -------------------------------------
	public static void crtc(int N) {
		for (int i = 0; i < N; i++) {
			System.out.print("-");
		}
		System.out.println();
	}


	//	crtice: RETURN a string "-" N times in a row ---------------------------
	public static String crtcs(int length) {
		StringBuffer outputBuffer = new StringBuffer(length);
		for (int i = 0; i < length; i++){
			outputBuffer.append("-");
		}
		return outputBuffer.toString();
	}


	//	prnts: PRINT a string --------------------------------------------------
	public static void prnts(String str) {
		System.out.println(str);
	}


	//	return timestamp in format: "[ 20180903_095322 ] --" -------------------
	//	run: System.out.printf("%s -- Starting ...\n", tms());
	public static String tms() {
        Date today2                       = Calendar.getInstance().getTime();
        SimpleDateFormat formatter_DT2    = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String date_and_time_string2      = formatter_DT2.format(today2);
		return "[ " + date_and_time_string2 + " ]";
    }


	// function that clears the screen -----------------------------------------
	public static void cls() {
		System.out.print("\033[H\033[2J");

	}


	// function: START info ----------------------------------------------------
	public static void start_info() {
		String tms = tms();
		System.out.printf("%s -- starting %s ...\n", tms, self_name);
	}


	//	capitalize: return CAPITALIZED word ------------------------------------
	public static String capitalize(String word) {
		return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
	}


	public static void funcs_list() {
		System.out.print("\n" + "Functions list:" + "\n" +
			"crtc(int N):       print a string \"-\" N times in a row ---------------------------" + "\n" +
			"crtcs(int length): print a string \"-\" N times in a row ---------------------------" + "\n" +
			"prnts(String str):	prints a string (instead of System.out. ...)" + "\n" +
			"tms():	return timestamp in format: [ 20180903_095322 ] --" + "\n" +
			"cls(): clear the screen" + "\n" +
			"start_info(): display: [ 20190411_204842 ] -- starting [AppNAme] ..." + "\n");
	}


	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------

} // END class
