//DANES.java -- simple test

public class DANES
{

    //properties (states)
    static String my_name = "Gregor";
    static String my_sname = "Redelonghi";
    
    //methods
    public String getMyName() {
        return my_name;
        
    }
    
    public String getMySname() {
        return my_sname;            
    }
    
    public void printMyData() {
        System.out.println("My name is: " + my_name + ", and my scnd name is: " + my_sname);
        
    }

    
    static public void main(String[] args)
    {
    
    DANES obj1 = new DANES();
    
    String nm = obj1.my_name;
    System.out.println("Printing from main: My name is" + nm);
    
    String snm = obj1.my_sname;
    System.out.println("Printing from main: My scnd name is" + snm);
    
    System.out.println("Printing from object function:");
    obj1.printMyData();
     
    
    }
 
} 