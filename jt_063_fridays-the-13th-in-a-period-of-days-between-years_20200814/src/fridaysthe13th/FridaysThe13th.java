package fridaysthe13th;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.time.format.*;
import java.time.format.DateTimeFormatter;

/**
 * FridaysThe13th
 * Finds all the dates between startDate and endDat that fall on Friday, the 13th.
 */
public class FridaysThe13th{

    public static void main(String[] args) {
        int startYear;
        int endYear;

        if (args.length == 2) {
            startYear = Integer.valueOf(args[0]);
            endYear = Integer.valueOf(args[1]);
        } else if (args.length == 1) {
            startYear = Integer.valueOf(args[0]);
            endYear = startYear;
        } else {
            startYear = LocalDate.now().getYear();
            endYear = startYear;
        }

        LocalDate startDate = LocalDate.of(startYear, 1, 1);
        System.out.println("startDate: " + startDate);

        LocalDate endDate = LocalDate.of(endYear, 12, 31);
        System.out.println("endDate: " + endDate);

        // calculating number of days bettwen startDate and and Date
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Number of days between two dates is: " + days);

        // base date & initial count of hits
        LocalDate current = startDate;
        int count = 0;

        // a list to hold hits (dates that fall on Friday, the 13th)
        ArrayList<LocalDate> hits = new ArrayList<LocalDate>();

        /* loop over all dates - if a hit:  - store it into a list of hits
         *                                  - increment count by one
         */
        while (!current.isAfter(endDate)) {
            if ( current.getDayOfMonth() == 13  && current.getDayOfWeek().getValue() == 5 ) {
                    count += 1;
                    hits.add(current);
            }
            current = current.plusDays(1);
        } // end while

        // final printout
        if (count != 0) {
            System.out.println("\n" + "Total of " + count + " of Fridays the 13th found:");
            printOut(hits);
        } else {
            System.out.println("No fridays on 13th found!");
        }



    } // end main


    public static void printOut(ArrayList<LocalDate> hits) {
        String doubleLine = "==========================================";
        String singleLine = "------------------------------------------";
        System.out.println(doubleLine);
        System.out.printf("%-10s%-15s%n", "Year", "Date");
        System.out.println(doubleLine);
        int pYear = hits.get(0).getYear();
        for (int i = 0; i < hits.size(); i++) {
            int cYear = hits.get(i).getYear();
            if (cYear != pYear) {
                System.out.println(singleLine);
                System.out.printf("%-10d%-15s%n", cYear, hits.get(i).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
            } else {
                System.out.printf("%-10d%-15s%n", cYear, hits.get(i).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
            }
            pYear = cYear;
        }
        System.out.println(doubleLine);
    }// end func

} // end class
