// TestRectangle.java

public class TestRectangle {
    public static void main(String[] args) {

        // first way
        int myPerimeter = new Rectangle(20, 10).perimeter();
        int myArea = new Rectangle(20, 10).area();
        System.out.printf("The perimeter of rectangle(20, 10) is: %d%n", myPerimeter);
        System.out.printf("The area of rectangle(20, 10) is: %d%n", myArea);

        // second way:
        int wd = 40;
        int hg = 20;
        Rectangle rct2 = new Rectangle(wd, hg);
        System.out.printf("The perimeter of rectangle(%d, %d) is: %d%n", wd, hg, rct2.perimeter());
        System.out.printf("The area of rectangle(%d, %d) is: %d%n", wd, hg, rct2.area());
    }
}
