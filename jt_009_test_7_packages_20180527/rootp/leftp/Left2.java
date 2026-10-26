package leftp;
import rightp.*;

public class Left2 {
    public Left2() {
        System.out.println("This is class Left2 from package leftp.");
    }
    
    public void my_self() {
        System.out.println("This is method my_self from class Left2 in package leftp.");
    }
    
    public static void main(String[] args) {
        
        System.out.println("****************************************");
        System.out.println("* This is Left2 class in leftp package *");
        System.out.println("****************************************");
        
        System.out.println("\nInstanstiating rightp.Right2 class:");
        Right2 rightob = new Right2();
        
        // executing my_self method from Right
        System.out.println("\nAccessing my_self method from class Right2 in rightp package:");
        rightob.my_self();
    }
}
