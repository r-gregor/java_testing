import java.util.Scanner;

public class SimpCalc {
    public static void main(String[] args) {
        int input = 0;
        System.out.println("The super insano calculator");
        System.out.println("enter the corrosponding number:");
        Scanner reader3 = new Scanner(System.in);
        System.out.println(
            "1. Add | 2. Subtract | 3. Divide | 4. Multiply");

        input = reader3.nextInt();

        int a = 0, b = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number");
        // get user input for a
        a = reader.nextInt();

        Scanner reader1 = new Scanner(System.in);
        System.out.println("Enter the scend number");
        // get user input for b
        b = reader1.nextInt();

        switch (input){
            case 1:  System.out.println(a + " + " + b + " = " + add(a, b));
                     break;
            case 2:  System.out.println(a + " - " + b + " = " + subtract(a, b));
                     break;
            case 3:  System.out.println(a + " / " + b + " = " + divide(a, b));
                     break;
            case 4:  System.out.println(a + " * " + b + " = " + multiply(a, b));
                     break;
            default: System.out.println("your input is invalid!");
                     break;
        }
    }

    static int      add(int lhs, int rhs) { return lhs + rhs; }
    static int subtract(int lhs, int rhs) { return lhs - rhs; }
    static int   divide(int lhs, int rhs) { return lhs / rhs; }
    static int multiply(int lhs, int rhs) { return lhs * rhs; }
}