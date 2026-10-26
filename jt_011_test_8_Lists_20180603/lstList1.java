import java.util.List;
import java.util.ArrayList;

class lstList1 {
    
    public static void main(String[] args){
        List<String> imena = new ArrayList<String>(); // list objects
        String[] nms = {"Gregor", "Tadeja", "KrNeki", "Zala", "Mark", "Spela"}; // array of strings
        
        // populate list object with array elements
        for (int i=0; i < nms.length; i++) {
            imena.add(nms[i]);
        }
        
        System.out.println("The contents of unchanged lstList imena: " + imena);
        
        imena.add("Nebukadnezar");
        imena.add("Muad'Ib");
        System.out.println("\nThe contents of expanded lstList imena: " + imena);
        
        // get index of element
        int num = imena.indexOf("KrNeki");
        System.out.println("\nElement to be removed -- with index " + num + " is: " + imena.get(num));
        
        // remove element at index
        imena.remove(num);     
        System.out.println("The contents of CHANGED lstList imena: " + imena);
        
        System.out.println("\nRemoving an element from lstList imena by name \"Muad'Ib\"...");
        
        // remove element by name
        imena.remove("Muad'Ib");
        System.out.println("The contents of CHANGED lstList imena: " + imena);
        
        System.out.println("\nRemoving LAST element from lstList imena: "  + imena.get(imena.size() - 1) + " ...");
        
        // remove LAST element by index
        imena.remove(imena.size() - 1);
        System.out.println("The contents of CHANGED lstList imena: " + imena);
    }
}
