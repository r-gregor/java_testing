public class ObjTest2
{
    public static String myName2 = "This is objTest2 class";
    public static int myAge2 = 49;
    
    ObjTest2()
    {
        String msg2 = "This is constructor of objTest2 class.";
        System.out.println(msg2);
    }

    public static void main(String[] args)
    {
        ObjTest2 obj1 = new ObjTest2();
        System.out.println("The class variables called from within obj1: " + obj1.myName2 + ", " + obj1.myAge2);
        System.out.println("The class variables called from ObjTest2 class: " + ObjTest2.myName2 + ", " + ObjTest2.myAge2);
        
        System.out.println("\n" + "The class variables called from ObjTest1 class: " + ObjTest1.myName + ", " + ObjTest1.myAge);

    }

}