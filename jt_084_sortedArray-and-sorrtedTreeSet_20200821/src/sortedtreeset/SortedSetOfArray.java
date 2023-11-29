package sortedtreeset;

import java.util.*;

/**
 * Fills the ArrayList with integers and displays sorted set one by one
 * in natural order. Duplicates NOT allowed
 */
public class SortedSetOfArray {

    private final TreeSet<Integer> nums = new TreeSet<Integer>();

    public static void main(final String[] args) {
        final SortedSetOfArray ssoa = new SortedSetOfArray();

        ssoa.addNum(10);
        ssoa.addNum(3);
        ssoa.addNum(9);
        ssoa.addNum(5);
        ssoa.addNum(8);
        ssoa.addNum(4);
        ssoa.addNum(5);
        ssoa.addNum(8);
        ssoa.addNum(7);

        // ssoa.displayOneByOne();
        ssoa.displayAll();

    }

    /**
     * Adds an integer into ArrayList
     * @param n int
     */
    public void addNum(final int n) {
        this.nums.add(Integer.valueOf(n));
        System.out.printf("Number %d added to list ...%n", n);
    } // end addNum()

    /**
     * Displays elemnts of Arraylist one by one
     */
    public void displayOneByOne() {
        System.out.println("\n" + "Displaying sorted contents of list ...");
        for (final Integer num : this.nums) {
            System.out.println(num);
        } // end for loop
    } // end displayOneByOne()
    
    /**
     * Displays elemnts of Arraylist as list
     */
    public void displayAll() {
        System.out.println("\n" + "Displaying sorted contents of list ...");
        System.out.println(this.nums);
    } // end displayAll()

} // end class