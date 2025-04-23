import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetDateAsString_V1 {
    static Date today                       = Calendar.getInstance().getTime();
    static SimpleDateFormat formatter_DT    = new SimpleDateFormat("yyyyMMdd_hhmmss");
    static SimpleDateFormat formatter_D     = new SimpleDateFormat("yyyyMMdd");
    static String date_and_time_string      = formatter_DT.format(today);
    static String date_string               = formatter_D.format(today);
    
    public static String getDateTimeAsString() {
        Date today                       = Calendar.getInstance().getTime();
        return date_and_time_string;
    }
    
    public static String getDateAsString() {
        return date_string;
    }
    
    public static String tms() {
        Date today2                       = Calendar.getInstance().getTime();
        SimpleDateFormat formatter_DT2    = new SimpleDateFormat("yyyyMMdd_hhmmss");
        String date_and_time_string2      = formatter_DT2.format(today2);
        return "[ " + date_and_time_string2 + " ]";
    }
}
