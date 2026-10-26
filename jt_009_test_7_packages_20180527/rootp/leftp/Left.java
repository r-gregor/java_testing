package leftp;

public class Left {
    public Left() {
        System.out.println("This is class Left from package leftp.");
    }
    
    public void my_self() {
        System.out.println("This is method my_self from class Left in package leftp.");
    }
    
    public static void main(String[] args) {
        
                
        System.out.println("***************************************");
        System.out.println("* This is Left class in leftp package *");
        System.out.println("***************************************");
        
        System.out.println("\nInstanstiating rightp.Right class:");
        rightp.Right rightob = new rightp.Right();
        
        // executing my_self method from Right
        System.out.println("\nAccessing my_self method from class Right in rightp package:");
        rightob.my_self();
    }
}