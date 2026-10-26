/** Represents a Cartesian (x,y) point */
public class Point
{
    public double x, y; // The coordinates of the point
    public Point(double x, double y)
    {                                       // A constructor that
        this.x = x; this.y = y;             // initializes the fields
        System.out.println("The class Point has been initialized!");
    }
    
    public double distanceFromOrigin()
    {                                       // A method that operates on
        return Math.sqrt(x*x + y*y);        // the x and y fields
    }
    
    
    public static void main(String[] args)
    {
        Point p = new Point(10, 25);
        double D = p.distanceFromOrigin();
        System.out.println("The distance of points: " + p.x + " and " + p.y + " is: " + D);
    }
}