package rut;

import rut.left.*;
import rut.left.subleft.*;
import rut.right.*;

public class Main {
    
    public void mainInfo() {
        System.out.println("This is class \"Main\" in package \"rut\".");
    }
    
    public void rutTree() {
        String msg = "\nPackages tree:\n"+
"   rut\n" +
"   +-- left\n" +
"       +-- Left.class\n" +
"       +-- Left.java\n" +
"       L-- subleft\n" +
"           +-- SubLeft.class\n" +
"           L-- SubLeft.java\n" +
"   +-- Main.class\n" +
"   +-- Main.java\n" +
"   L-- right\n";

    System.out.println(msg);
    }
    
    public static void main(String[] args) {
        System.out.println("mainInfo function: ");
        Main main = new Main();
        main.mainInfo();
        main.rutTree();
        
        System.out.println("\nleft.leftInfo function: ");
        Left left = new Left();
        left.leftInfo();
        
        System.out.println("\nsubLeft.subLeftInfo  function: ");
        SubLeft subLeft = new SubLeft();
        subLeft.subLeftInfo();
        
        System.out.println("\nright.rightInfo function: ");
        Right right = new Right();
        right.rightInfo();
        
    }
}
