import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Tms {

	static Date today                              = Calendar.getInstance().getTime();

	public static String tms() {
		SimpleDateFormat formatter_DT2      = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String date_and_time_string2        = formatter_DT2.format(today);
		return "[ " + date_and_time_string2 + " ]";
	}

	// V6
	public static Integer get_curryr() {
		SimpleDateFormat formatter_DT3      = new SimpleDateFormat("yyyy");
		String curryr_string                = formatter_DT3.format(today);
		return Integer.valueOf(curryr_string);
	}
}

