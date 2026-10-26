class StopMe2 {
    public static void main(String[] args)
        throws java.io.IOException {
            char ans;
            System.out.println("This is StopMe2 class ... ");
            do {
                System.out.print("Unless you enter the character 'S', this loop will run forever ... ");
                ans = (char) System.in.read();


                    if (ans == 'S') {
                        System.out.println("You've got it right! Bye.");
                    }
            } while (ans != 'S');
        }
}
