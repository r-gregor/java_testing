// filename: removeDupsFromArrayList3_StreamDistinct.java
// Java program to remove duplicates from ArrayList

/*
How to Remove Duplicates from ArrayList

3. Using Java 8 Stream.distinct()

You can use the distinct() method from the Stream API. The distinct() method return a new Stream without
duplicates elements based on the result returned by equals() method, which can be used for further processing.
The actual processing of Stream pipeline starts only after calling terminal methods like forEach() or collect().

Approach:
- Get the ArrayList with duplicate values.
- Create a new List from this ArrayList.
- Using Stream().distinct() method which return distinct object stream.
- convert this object stream into List
*/

import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
  
// Program to remove duplicates from a List in Java 8 
class removeDupsFromArrayList3_StreamDistinct 
{ 
    public static void main(String[] args) 
    { 
        // input list with duplicates 
        List<Integer> list = new ArrayList<>( 
            Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5)); 
            // Print the Arraylist 
        System.out.println("ArrayList with duplicates: "
                           + list); 
  
        // Construct a new list from the set constucted from elements 
        // of the original list 
        List<Integer> newList = list.stream() 
                                      .distinct() 
                                      .collect(Collectors.toList()); 
  
        // Print the ArrayList with duplicates removed 
        System.out.println("ArrayList with duplicates removed: "
                           + newList); 
    } 
} 
