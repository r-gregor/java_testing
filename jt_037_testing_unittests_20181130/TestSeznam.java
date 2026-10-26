class Seznam {
    String name;
    static int num_of_entries = 0;
    String[] group = new String[10];
    
    public void addName(String name) {
        if (num_of_entries >= group.length) {
            System.out.println("Element " + name + ": The group array is full! Not adding to group ...");
            return;
        } //end if
        
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                continue;
            } else {
                group[i] = name;
                this.num_of_entries += 1;
                System.out.printf("Name %s added to group. Number of elements is: %d%n", name, num_of_entries);
                break;
            } // end if
        } // end for
        
    } //end addName
    
    public void printOut() {
        for (int z = 0; z < group.length; z++) {
                if (group[z] == null) {
                    continue;
                } // end if
                
            System.out.printf("The element %d of group is: %s%n", z, group[z]);
        } // end for
    } // end printOut
    
} // end class
    
    
public class TestSeznam {
    static int entry;
        
    //main: test
    public static void main(String[] args) {
        if (args.length == 0) {
            entry = 1;
        } else {
            entry = Integer.valueOf(args[0]);
        }
        
        Seznam S1 = new Seznam(); 
        for (int j = 0; j < entry; j ++) {
            String my_name = "Ime_" + j;
            S1.addName(my_name);
            
        }
        System.out.println();
        
        S1.printOut();
    } // end main
    
} // end class