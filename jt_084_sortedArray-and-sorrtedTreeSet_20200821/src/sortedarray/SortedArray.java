package sortedarray;

import java.util.*;


/**
 * Fills the ArrayList with integers and displays sorted one by one
 * in natural order. Duplicates are allowed
 */
public class SortedArray {
    private ArrayList<Integer> nums2 = new ArrayList<Integer>();

    public static void main(String[] args) {
        SortedArray sa = new SortedArray();

        // adding integers to ArrayList
        sa.addNum(10);
        sa.addNum(3);
        sa.addNum(9);
        sa.addNum(5);
        sa.addNum(8);
        sa.addNum(4);
        sa.addNum(5);
        sa.addNum(8);
        sa.addNum(7);
        
        // sa.displayOneByOne();
        sa.display();

    } // end of main()

    /**
     * Adds an integer into ArrayList
     * @param n int
     */
    public void addNum(int n) {
        this.nums2.add(Integer.valueOf(n));
        System.out.printf("Number %d added to list ...%n", n);
    }// end of addNum()

    /**
     * Displays elemnts of Arraylist one by one
     */
    public void displayOneByOne() {
        Collections.sort(nums2);
        System.out.println("\n" + "Displaying sorted contents of list ...");
        for (Integer num : this.nums2) {
            System.out.println(num);
        }
    }// end of displayOneByOne()

        /**
     * Displays elemnts of Arraylist as list
     */
    public void display() {
        Collections.sort(this.nums2);
        System.out.println("\n" + "Displaying sorted contents of list ...");
        System.out.println(this.nums2);
        
    }// end of displayOneByOne()

} // end of class