import java.util.Scanner;

class StopMe3 {

    public static char ans;

    public static void main(String[] args) {
        // throws java.io.IOException {

            Scanner sc = new Scanner(System.in);
            // String ans;
            System.out.println("This is StopMe3 class ... ");

            while (ans != 'S') {
                System.out.print("Unless you enter the character 'S', this loop will run forever ... ");
                // ans = scanner.nextLine();
                char ans = sc.next().charAt(0);

                    if (ans == 'S') {
                        System.out.println("You've got it right! Bye.");
                        break;
                    }
            }
        }
}
