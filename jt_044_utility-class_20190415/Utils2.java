// filename Utils2.java

// imports for date/time calculations
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public final class Utils2 {
    // final --> cannot be extended
    // private empty constructor --> cannot be inastatiated
    private Utils2() {}

    // constants
    public static final String self_name = System.getProperty("sun.java.command");


    // ############ FUNCTIONS ############

    /**
     CLEAR the screen
     */
    public static void cls() {
    	System.out.print("\033[H\033[2J");
    }


    /**
     Print a line of "C" [num] chars wide
     @param num     number of "C"s
     */
    public static void crta(int num, String C) {
		for (int i = 0; i < num; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

    /**
     Print a line of "-" [num] chars wid
     @param num     number of "-"
     */
    public static String crta_st(int num, String C) {
        String crtice = "";
        for (int i = 0; i < num; i++) {
            crtice += C;
        }
        return crtice;
    }

        /**
         tprint a string "----" [num] chars wide
         @param num     number of '-'s
         */
        public static void crta_tp(int num, String C) {
            String crtice = "";
            for (int i = 0; i < num; i++) {
                crtice += C;
            }
            tprint(crtice);
        }

    /**
     return timestamp in format: "[ 20180903_095322 ] --"
	 run: System.out.printf("%s -- Starting ...\n", tms());
     */
	public static String tms() {
        Date today2                       = Calendar.getInstance().getTime();
        SimpleDateFormat formatter_DT2    = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String date_and_time_string2      = formatter_DT2.format(today2);
		return "[ " + date_and_time_string2 + " ] -- ";
    }

    /**
    function: START info
     */
	public static void start_info() {
		String my_tms = tms();
		System.out.printf("%s starting %s ...%n", my_tms, self_name);
	}


    /**
     print a line (String) with preapended timestamp
     */
     public static void tprint(String line) {
         String my_tms = tms();
         System.out.printf("%s %s%n", my_tms, line);
     }


}
