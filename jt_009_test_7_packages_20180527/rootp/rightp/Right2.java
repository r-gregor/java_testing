package rightp;
import leftp.*;

public class Right2 {
    public Right2() {
        System.out.println("This is class Right2 from package rightp.");
    }
    
    public void my_self() {
        System.out.println("This is method my_self from class Right2 in package rightp.");
    }
    
    public static void main(String[] args) {
        
        System.out.println("******************************************");
        System.out.println("* This is Right2 class in rightp package *");
        System.out.println("******************************************");
        
        System.out.println("\nInstanstiating leftp.Left2 class:");
        Left2 leftob = new Left2();
        
        // executing my_self method from Left
        System.out.println("\nAccessing my_self method from class Left2 in leftp package:");
        leftob.my_self();
    }
}