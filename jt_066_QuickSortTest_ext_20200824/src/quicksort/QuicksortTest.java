package quicksort;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class QuicksortTest {

    private int[] numbers, numbers2;
    private final static int SIZE = 1000;
    private final static int MAX = 900;

    @Before
    public void setUp() throws Exception {
        numbers = new int[SIZE];
        numbers2 = new int[SIZE];
        Random generator = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = generator.nextInt(MAX);
        }
    }

    @Test
    public void testNull() {
        Quicksort sorter = new Quicksort();
        sorter.sort(null);
    }

    @Test
    public void testEmpty() {
        Quicksort sorter = new Quicksort();
        sorter.sort(new int[0]);
    }

    @Test
    public void testSimpleElement() {
        Quicksort sorter = new Quicksort();
        int[] test = new int[1];
        test[0] = 5;
        sorter.sort(test);
    }

    @Test
    public void testSpecial() {
        Quicksort sorter = new Quicksort();
        int[] test = { 5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5, 8, 405, -18, 1 };
        sorter.sort(test);
        if (!validate(test)) {
            fail("Should not happen");
        }
        printResult(test);
    }

    @Test
    public void testQuickSort() {
        /*
        for (Integer i : numbers) {
            System.out.println(i + " ");
        }
        */

        long startTime = System.currentTimeMillis();
        
        Quicksort sorter = new Quicksort();
        sorter.sort(numbers);
        for (Integer i : numbers) {
            System.out.print(i + ", ");
        }
        System.out.println();

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        // added by me:
        System.out.printf("startTime [milis]: %d%nendTime [milis]: %d%n", startTime, stopTime);        
        System.out.println("Quicksort " + elapsedTime);

        if (!validate(numbers)) {
            fail("Should not happen");
        }
        assertTrue(true);
    }

    @Test
    public void testStandardSort() {
        long startTime = System.currentTimeMillis();
        Arrays.sort(numbers2);
        
        for (Integer i : numbers2) {
            System.out.print(i + ", ");
        }
        System.out.println();

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        
        // added by me:
        System.out.printf("startTime [milis]: %d%nendTime [milis]: %d%n", startTime, stopTime);
        System.out.println("Standard Java sort " + elapsedTime);

        if (!validate(numbers2)) {
            fail("Should not happen");
        }
        assertTrue(true);

    }

    private boolean validate(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private void printResult(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }
}