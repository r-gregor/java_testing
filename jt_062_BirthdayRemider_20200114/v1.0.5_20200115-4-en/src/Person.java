import java.time.*;
import java.time.temporal.*;

public class Person {
    public String name;
    public String rd;
    public String nrd;
    public int diff;
    public int age;

    // java 8 and up
    private final LocalDate today = LocalDate.now();

    public void calcDatesAndDiff() throws Exception {
        final LocalDate d1 = today;
        final String d2 = rd;
        final String[] d2s = d2.split("\\.");

        final int yr = Integer.parseInt(d2s[2]);
        final int mn = Integer.parseInt(d2s[1]);
        final int dy = Integer.parseInt(d2s[0]);
        final int currYr = today.getYear();
        int finalYear = currYr;

        final LocalDate nd2 = LocalDate.of(currYr, mn, dy);

        // java 8 and up
        long noOfDaysBetween = ChronoUnit.DAYS.between(d1, nd2);

        long daysInYear = 365;
        final boolean isLeapYear = ((currYr % 4 == 0) && (currYr % 100 != 0) || (currYr % 400 == 0));
        
        if (isLeapYear) {
            daysInYear += 1;
        }

        // if today is pass day of birth of this year: diff < 0
        // substract diff of number of days in thisyear
        // add 1 day to this year
        if (noOfDaysBetween < 0 ) {
            noOfDaysBetween += daysInYear;
            finalYear += 1;
        }

        this.diff = (int)noOfDaysBetween;
        this.age = finalYear - yr;
        this.nrd = d2s[0] + "." + d2s[1] + "." + String.valueOf(finalYear);
    }

    
    // ADDED for sorting
    public int getDiff() {
        return this.diff;   
    }

    // ADDED for sorting
    @Override
    public String toString() {
        return "Ime: [" + name + ", dni do RD:" + diff + "]";
    }
}