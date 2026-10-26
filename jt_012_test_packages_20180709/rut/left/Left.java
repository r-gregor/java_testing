package rut.left;

import rut.left.subleft.*;

public class Left {
    
    public void leftInfo() {
        System.out.println("This is class \"Left\" in package \"run.left\".");
    }
    
    public static void main(String[] args) {
        System.out.println("This only gets printed if \"rut.left.Left\" is run locally.");
        
        System.out.println("\nRunning \"subLeftInfo\" function from \"rut.left.subLeft\" package.");
        SubLeft subLeft = new SubLeft();
        subLeft.subLeftInfo();
        
    }
	
}
