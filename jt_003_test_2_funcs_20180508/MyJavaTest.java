//file: MyJavaTest.java

public class MyJavaTest
{
    public static String msg_1 = "This is my 1-st java class test message."; 
    public static String msg_2 = "This is my 2-nd java class test message.";
    
    // function -- print msg_1
    public void prnt1()
    {
        System.out.println(msg_1);
    }
    
    // function -- print msg_2
    public void prnt2()
    {
        System.out.println(msg_2);
    }
    
    // function -- print message as a parameter to function.
    public void prnt3(String msg)
    {
        System.out.println(msg);
    }
    
    public static void main(String[] args)
    {
        
        MyJavaTest obj1 = new MyJavaTest();
        
        System.out.println(obj1.msg_1);
        System.out.println(obj1.msg_2);

        System.out.println("\nThis is -- printing messages from function:");
        obj1.prnt1();
        obj1.prnt2();
        
        System.out.println("\nThis is -- printing messages from function with parameter:");
        obj1.prnt3(msg_1);
        obj1.prnt3(msg_2);
        /*  obj1.prnt3(msg_3); // error
         *  but ...
         */
        String msg_3 = "This is the third java class test nessage!";
        obj1.prnt3(msg_3);
    }
}
