// filename: MergeSortedArrays_V2.java

import java.util.*;

public class MergeSortedArrays_V2 {
    
    // TEST    
    /** main */
    public static void main(String[] argv) {
        int[] Arr1 = {1, 3, 5, 7, 7, 9, 11};
        int[] Arr2 = {2, 4, 4, 4, 6, 8, 10, 10, 12};
        int[] FinalArray = merge(Arr1, Arr2);
        
        Set<Integer> FinalSet = new HashSet<Integer>();
        
        for (Integer el: FinalArray) {
            FinalSet.add(el);
        }
        
        System.out.println("Arr1: " + Arrays.toString(Arr1));
        System.out.println("Arr2: " + Arrays.toString(Arr2));
        
        System.out.printf("%n" + "Number of elements in FinalArray = %d%n", FinalArray.length);
        
        /*
        System.out.print("Merged arrays: ");
        for (int i = 0; i < FinalArray.length; i++) {
            System.out.print(FinalArray[i] + " ");
        }
        */
        
        System.out.println("Merged arrays: " + Arrays.toString(FinalArray));
        System.out.println("Final set: " + FinalSet.toString());
    }
    
    public static int[] merge(int[] L1, int[] L2) {
        int n1 = L1.length;
        int n2 = L2.length;
        int[] FA = new int[n1 + n2];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < n1 && j < n2) {
            if (L1[i] <= L2[j]) {
                FA[k] = L1[i];
                i++;
            } else {
                FA[k] = L2[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            FA[k] = L1[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            FA[k] = L2[j];
            j++;
            k++;
        }
        
        return FA;
    }
}