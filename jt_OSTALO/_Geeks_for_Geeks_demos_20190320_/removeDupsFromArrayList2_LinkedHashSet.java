// filename: removeDupsFromArrayList2_LinkedHashSet.java
// Java program to remove duplicates from ArrayList 

/*
How to Remove Duplicates from ArrayList

2. Using LinkedHashSet

- Get the ArrayList with duplicate values.
- Create a LinkedHashSet from this ArrayList. This will remove the duplicates
- Convert this LinkedHashSet back to Arraylist.
- The second ArrayList contains the elements with duplicates removed.
*/

import java.util.*; 
  
public class  removeDupsFromArrayList2_LinkedHashSet {
  
    // Function to remove duplicates from an ArrayList 
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    { 
  
        // Create a new LinkedHashSet 
        Set<T> set = new LinkedHashSet<>(); 
  
        // Add the elements to set 
        set.addAll(list); 
  
        // Clear the list 
        list.clear(); 
  
        // add the elements of set 
        // with no duplicates to the list 
        list.addAll(set); 
  
        // return the list 
        return list; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
  
        // Get the ArrayList with duplicate values 
        ArrayList<Integer> 
            list = new ArrayList<>( 
                Arrays 
                    .asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5)); 
  
        // Print the Arraylist 
        System.out.println("ArrayList with duplicates: "
                           + list); 
  
        // Remove duplicates 
        ArrayList<Integer> 
            newList = removeDuplicates(list); 
  
        // Print the ArrayList with duplicates removed 
        System.out.println("ArrayList with duplicates removed: "
                           + newList); 
    } 
} 