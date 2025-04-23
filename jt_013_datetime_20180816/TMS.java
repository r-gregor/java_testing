import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TMS {
    
    public static String tms() {
        Date today2                       = Calendar.getInstance().getTime();
        SimpleDateFormat formatter_DT2    = new SimpleDateFormat("yyyyMMdd_hhmmss");
        String date_and_time_string2      = formatter_DT2.format(today2);
        return "[ " + date_and_time_string2 + " ]";
    }
}
