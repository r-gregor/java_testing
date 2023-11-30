public class ObjTest3
{
    // object variables
    String dayName = "FRIDAY";
    int weekNum = 52;
    
    public static String myName3 = "This is objTest3 class";
    
    // un-parametrized constructor -- instead of global ...
    ObjTest3()
    {
        String msg1 = "This is un-pramatereized constructor of objTest3 class.";
        System.out.println(msg1);
        System.out.println("Day name is: " + dayName + ", week number: " + weekNum);        
    }
    
    // parameterized constructor
    ObjTest3(String day, int week)
    {
        this.dayName = day;
        this.weekNum = week;

        String msg2 = "\nThis is parameterized constructor of objTest3 class.";
        System.out.println(msg2);
        System.out.println("Day name is: " + dayName + ", week number: " + weekNum);
    }
    
    // MAIN!!!
    public static void main(String[] args)
    {
        ObjTest3 obj1 = new ObjTest3();                 // un-pramatereized ... 
        ObjTest3 obj2 = new ObjTest3("TUESDAY", 21);    // parameterized ...

    }

}
