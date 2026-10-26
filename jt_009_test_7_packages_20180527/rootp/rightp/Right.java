package rightp;

public class Right {
    public Right() {
        System.out.println("This is class Right from package rightp.");
    }
    
    public void my_self() {
        System.out.println("This is method my_self from class Right in package rightp.");
    }
    
    public static void main(String[] args) {
        
        System.out.println("*****************************************");
        System.out.println("* This is Right class in rightp package *");
        System.out.println("*****************************************");
        
        System.out.println("\nInstanstiating leftp.Left class:");
        leftp.Left leftob = new leftp.Left();
        
        // executing my_self method from Left
        System.out.println("\nAccessing my_self method from class Left in leftp package:");
        leftob.my_self();
    }
}