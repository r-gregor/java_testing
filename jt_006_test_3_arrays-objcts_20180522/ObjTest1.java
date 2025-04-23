class ObjTest1
{
    public static String myName = "This is objTest1 class";
    public static int myAge = 50;
    
    ObjTest1()
    {
        String msg = "This is constructor of objTest1 class.";
        System.out.println(msg);
    }
    
    public static void main(String[] args)
    {
        ObjTest1 obj1 = new ObjTest1();
        System.out.println("The class variables called from within obj1: " + obj1.myName + ", " + obj1.myAge);
        System.out.println("The class variables called from className: " + ObjTest1.myName + ", " + ObjTest1.myAge);     
    }
  
}