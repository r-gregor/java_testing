// DayOfWeek.java

import java.util.*;

/**
 * Displays the week day that comes after offset days from current day:
 *              DayOfWeek.printWeekDay(cuurent day, offset)
 *
 * @author  RgregoR, 20190924
 * @version 1.0
 */
public class DayOfWeek {
    
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
     * Prints the name of the day which is [offset] days from [currday]
     */
    private void printWeekDay(int currday, int offset) {


        int day_init = (currday + offset) % 7;
        int day = Math.abs(day_init);

        // TEST
        // System.out.println("Day number after modulo operation: " + day_init);
        
        day = (day_init < 0)? currday - day : day;
        day = (day == 0)? currday : day;

        System.out.printf("Week day %d days from %s is: %s%n", offset, weekDaysMap().get(currday), weekDaysMap().get(day));
        
    }

    public static void main (String[] args) {
        DayOfWeek wd = new DayOfWeek();
        wd.printWeekDay(1, 7);
        wd.printWeekDay(2, 27);
        wd.printWeekDay(2, 142);
        wd.printWeekDay(7, -140);
        wd.printWeekDay(7, -142);
        wd.printWeekDay(7, -280);
    }
}