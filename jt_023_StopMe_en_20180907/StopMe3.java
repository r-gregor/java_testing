import java.util.Scanner;

class StopMe3 {
    
    public static void main(String[] args) {
        // throws java.io.IOException {
            
            Scanner scanner = new Scanner(System.in);
            String ans;
            int go = 1;
            
            System.out.println("This is StopMe3 class ... ");
            do {
                System.out.print("Unless you enter the character 'S', this loop will run forever ... ");
                ans = scanner.nextLine();

                    if (ans == "S") {
                        System.out.println("You've got it right! Bye.");
                        go = 0;
                        break;
                    }
            } while (go != 0);
        }
}
