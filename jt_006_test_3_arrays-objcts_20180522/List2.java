import java.util.*;
public class List2
{

    public static void main(String[] args)
    {
    int intName = 111111;
    
    ArrayList<String> names = new ArrayList<String>();
    
    names.addAll(Arrays.asList("Gregor", "Tadeja", "Zala", "Mark", "Spela")); // add a list of elements
    names.add("Conan, " +  "The \"Barbarian\"");    // add a single element
    names.add("Princess Sophie, the 1-st");
    
    names.add(Integer.toString(intName));   // converting int to String
    
    System.out.println("The first name: " + names.get(0) + ", and the second name: " + names.get(1));
    System.out.println("The whole List: " + names);
    
    System.out.println();
    System.out.println("Iterating trough list with for-loop:");
    for (int i = 0; i < names.size(); i++)
        {
        System.out.println("The element " + i + " of list is: " + names.get(i));
        } //END for-loop

    } // end main()

} // END