import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetDateAsString_V2 {
    static SimpleDateFormat formatter_DT    = new SimpleDateFormat("yyyyMMdd_hhmmss");
    static SimpleDateFormat formatter_D     = new SimpleDateFormat("yyyyMMdd");

    
    public static String getDateTimeAsString() {
        Date today = Calendar.getInstance().getTime();
        return formatter_DT.format(today);
    }
    
    public static String getDateAsString() {
        Date today = Calendar.getInstance().getTime();
        return formatter_D.format(today);
    }
    
    public static String tms() {
        Date today2                       = Calendar.getInstance().getTime();
        SimpleDateFormat formatter_DT2    = new SimpleDateFormat("yyyyMMdd_hhmmss");
        String date_and_time_string2      = formatter_DT2.format(today2);
        return "[ " + date_and_time_string2 + " ]";
    }
}
