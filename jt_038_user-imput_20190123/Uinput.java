import java.util.*;

public class Uinput {
    
    public static double dst(double x, double y) {
        return Math.sqrt( Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        /*
        System.out.print("Enter your name: ");
        String m_name = input.next();
        System.out.println("Your name is: " + m_name);

        
        System.out.print("SQUARE:\nEnter the x, y coordinates of a point: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
                
        // test
        double x = 2.5;
        double y = 0.5;
        
        
        String position;
        
        if ((x >= 2.0 || x <= -2.0) || (y >= 1.0 || y <= -1.0)) {
            position = "is outside";
        } else {
            position = "is inside";
        }
        
        System.out.printf("The point (x=%.1f; y=%.1f) %s square (-2,1; 2,1; 2,-1; -2,-1)!%n", x, y, position);
        */

        
        // dy - dist
        double x1 = 0;
        double y1 = 8;
        
        // dx - dist
        double x2 = 12;
        double y2 = 0;
        
        double dy = dst(x1, y1);
        double dx = dst(x2, y2);
        double hptnz = dst(dx, dy);
        
        double k = dy / dx;
        
        System.out.printf("%nTRIANGLE:%nThe dy-leg distance of point(x1=%.1f; y1=%.1f) from 0,0 is: %.2f%n", x1, y1, dy);
        System.out.printf("The dx-leg distance of point(x2=%.1f; y2=%.1f) from 0,0 is: %.2f%n", x2, y2, dx);
        
        System.out.printf("The length of Hypotenuse of a triangle\nwith legs lengths of dx = %.1f and dy = %.1f is: %.2f%n", dx, dy, hptnz);
        
        
        System.out.print("Enter the x, y coordinates of a point: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
  
        double xi = dx - x3;
        double yi = k * xi;

        
        /*
        if ((x3 >= dx || x3 <= 0.0) || (y3 >= yi || y3 <= 0.0)) {
            position3 = "is outside";
        } else {
            position3 = "is inside";
        }
        */
        
        String position3 = ((x3 >= dx || x3 <= 0.0) || (y3 >= yi || y3 <= 0.0)) ? "is outside" : "is inside";
                
        System.out.printf("The point (x=%.1f; y=%.1f) %s triangle (A = 0.0, B = 12.0, C = 0.8)!%n", x3, y3, position3);

    }
}