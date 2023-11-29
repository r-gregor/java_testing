// SortingArrayListOfObjects.java


import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SortingArrayListOfObjects {

    

    // main ------------------------------------------------------------------
    public static void main(final String[] args) throws Exception {
        ArrayList<Person> seznam2 = new ArrayList<Person>();
        seznam2.add(new Person("Gregor Redelonghi", "22.02.1968"));
        seznam2.add(new Person("Testna Oseba 1", "11.02.2008"));
        seznam2.add(new Person("Tadeja Nali Redelonghi", "19.01.1970"));
        seznam2.add(new Person("Nina Skrbinšek", "18.02.1948"));
        seznam2.add(new Person("Zala Redelonghi", "07.05.1996"));
        seznam2.add(new Person("Manca Gorišek", "28.09.1971"));
        seznam2.add(new Person("Špela Redelonghi", "11.02.2008"));
        seznam2.add(new Person("Mark Redelonghi", "17.04.1999"));
        seznam2.add(new Person("Testna Oseba 2", "11.02.2008"));

        System.out.println("UN-sorted:");
        System.out.println(seznam2);

        System.out.println("---------------------------------------------------------");

        seznam2.sort(new DiffSorter());
        System.out.println("SORTED:");
        System.out.println(seznam2);

    }
} // end class
