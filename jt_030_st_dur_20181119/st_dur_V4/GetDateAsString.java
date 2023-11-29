import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetDateAsString {
    static SimpleDateFormat formatter_DT    = new SimpleDateFormat("yyyyMMdd_HHmmss");
    static SimpleDateFormat formatter_D     = new SimpleDateFormat("yyyyMMdd");

    public static Date getDate() {
        Date today = Calendar.getInstance().getTime();
        return today;
    }

    public static String getDateTimeAsString() {
        Date today = getDate();
        return formatter_DT.format(today);
    }

    public static String getDateAsString() {
        Date today = getDate();
        return formatter_D.format(today);
    }

    public static String tms() {
        Date today = getDate();
        String date_and_time_string2      = formatter_DT.format(today);
        return "[ " + date_and_time_string2 + " ]";
    }
}
