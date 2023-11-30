// DayOfWeek_V3.java

import java.util.*;

/**
 * Displays the week day that comes after offset days from current day:
 *              DayOfWeek.printWeekDay(cuurent day, offset)
 *
 * @author  RgregoR
 * @version V3 20191206
 */
public class DayOfWeek_V3 {
    int currday;
    int offset;
    
    // un-parameterized constructor
    DayOfWeek_V3() {
        this.currday = 1;
        this.offset = 7;
    }
    
    // parameterized constructor
    DayOfWeek_V3(int currday, int offset) {
        this.currday = currday;
        this.offset = offset;
    }
    
    /*
     * Returns a HashMap of key=integer, value=string representing the position of a day in a week staring with 1 = Monday.
     */
    private Map<Integer, String> weekDaysMap() {

        Map<Integer, String> weekDays = new HashMap<Integer, String>();
        weekDays.put(1, "Monday");
        weekDays.put(2, "Tuesday");
        weekDays.put(3, "Wednesday");
        weekDays.put(4, "Thursday");
        weekDays.put(5, "Friday");
        weekDays.put(6, "Saturday");
        weekDays.put(7, "Sunday");
        
        return weekDays;
    }
    
    /*
     * Prints the name of the day which is [offset] days from [currday].
     * NO parametes as it gets them from instance parameters: this.currday, this.offset
     */
    private void printWeekDay() {

        int day = (this.currday + this.offset) % 7;
        
        // if negative offset java returns positive modulo, so it needs to be substracted from currday
        day = (this.offset < 0)? Math.abs(7 + day) : day;
        
        // if offset = 0, or offset is divisible by 7, the day is same as currday
        day = (day == 0)? this.currday : day;

        // printout
        System.out.printf("Week day %d days from %s is: %s%n", this.offset, weekDaysMap().get(this.currday), weekDaysMap().get(day));
        
    }
    
    // main
    public static void main (String[] args) {
        
        // check for parameters --> if none: usage and exit
        if (args.length != 2) {
            System.out.printf(  "*** No PARAMETERS ***%n" +
                                "Usage:%n" +
                                "weekDays_V2 [currday] [offset]%n%n" +
                                "\t[currday] - an integer of a day in a week (1=Monday, ..., 7=Sunday).%n" +
                                "\t[offset] - an integer of days offset from current day (can be negative).%n");
            System.exit(1);
        }
        
        int currday = Integer.parseInt(args[0]);
        int offset = Integer.parseInt(args[1]);

        DayOfWeek_V3 wd = new DayOfWeek_V3(currday, offset);
        wd.printWeekDay();

    }
}