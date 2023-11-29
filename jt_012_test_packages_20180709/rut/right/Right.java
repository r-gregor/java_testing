package rut.right;

import rut.left.subleft.*;

public class Right {
    
    public void rightInfo() {
        System.out.println("This is class \"Right\" in package \"run.right\".");
    }
    
    public static void main(String[] args) {
        System.out.println("This only gets printed if \"rut.right.Right\" is run locally.");
        
        System.out.println("\nRunning \"subLeftInfo\" function from \"rut.left.subLeft\" package.");
        SubLeft subLeft = new SubLeft();
        subLeft.subLeftInfo();
        
    }
}
