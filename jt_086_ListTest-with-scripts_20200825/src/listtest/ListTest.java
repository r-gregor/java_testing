package listtest;

import java.util.*;


/**
 * Testing List interface with ArrayList instances as private members of a class
 * @author  RgregoR
 */
public class ListTest {

    private List<Integer> seznam = new ArrayList<Integer>();
    private List<Integer> kopijaSeznama = new ArrayList<Integer>();

    /** 
     * Return origina list
     * @return  original list
     */
    private List<Integer> getOriginalList() {
        return this.seznam;
    }

    /**
     * getClonedList()
     * Return cloned and sorted list
     * @return  cloned and sorted list
     */
    private List<Integer> getClonedList() {
        return this.kopijaSeznama;
    }

    /**
     * Add element to ArrayList
     * @param   element <Integer>
     */
    private void putElementIntoList(Integer e) {
        this.seznam.add(e);
    }

    /**
     * Print "List is empty: true/false"
     * @param   list    ArrayList<Integer>
     */
    private void areThereAnyElements(List<Integer> list) {
        System.out.println("List is empty: " + list.isEmpty());
    }


    /**
     * Print the contents of the list
     * @param   list    ArrayList<Integer>
     */
    private void printList(List<Integer> list) {
        System.out.println(list.toString());
    }

    /** 
     * Clear (empty) the entire original List
     */
    private void emptyOriginalList() {
        this.seznam.clear();
        System.out.println("Original list cleared!");
    }


    /**
     * Print status of the List: contents, and is it empty
     * @param   list    ArrayList<Integer>
     */ 
    private void about(List<Integer> list) {
        printList(list);
        areThereAnyElements(list);
    }

    /** 
     * clone original list to new  list and sort inplace the new one.
    */
    private void cloneAndSortOriginalList() {
        this.kopijaSeznama.addAll(this.seznam);
        Collections.sort(this.kopijaSeznama);
        System.out.println("Original list cloned and sorted!");
    }

    /**
     * main method
    */
    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.putElementIntoList(1);
        lt.putElementIntoList(3);
        lt.putElementIntoList(7);
        lt.putElementIntoList(5);
        lt.putElementIntoList(15);
        lt.putElementIntoList(52);
        lt.putElementIntoList(-5);
        lt.putElementIntoList(4);
        lt.putElementIntoList(-8);

        System.out.println("\n" + "Original list:");
        lt.about(lt.getOriginalList());

        System.out.println("\n" + "Clone and sort original list:");
        lt.cloneAndSortOriginalList();

        System.out.println("\n" + "Cloned list:");
        lt.about(lt.getClonedList());

        System.out.println("\n" + "Original list:");
        lt.about(lt.getOriginalList());

        System.out.println("\n" + "Clear original list:");
        lt.emptyOriginalList();

        System.out.println("\n" + "Original list:");
        lt.about(lt.getOriginalList());

        System.out.println("\n" + "Cloned list:");
        lt.about(lt.getClonedList());
    } // end of main
    
} // end of class



