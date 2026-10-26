package quicksort;

import java.util.*;
import quicksort.Quicksort;
import quicksort.QuicksortTest;

public class Main {

    public static void main(String[] args) throws Exception {
        QuicksortTest qt = new QuicksortTest();

        qt.setUp();
        qt.testNull();
        qt.testEmpty();
        qt.testSimpleElement();

        System.out.println();
        System.out.println("testSpecial ...");
        qt.testSpecial();
        System.out.println();

        System.out.println("testQuickSort ...");
        qt.testQuickSort();
        System.out.println();

        System.out.println("testStandardSort ...");
        qt.testStandardSort();
    }
}