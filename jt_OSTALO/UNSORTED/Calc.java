import java.util.*;

public class Calc {
    static double my_PI = 3.1516927;
    double area;
    
    public static double circle_area(double r) {
        return r * r * my_PI;
    }
    
    
    
    public static void main(String[] args) {
        
        for (double r = 1.0; r <= 10.0; r += 0.5) {
            System.out.println("Area of a circle with radius " + r + " cm is: " + circle_area(r) + " cm2.");
        }
        
    }
}