class StopMe5 {
    public static void main(String[] args)
        throws java.io.IOException {
            char ans = 'a';
            System.out.println("This is StopMe2 class ... ");

            while (ans != 'S') {
                System.out.print("Unless you enter the character 'S', this loop will run forever ... ");
                ans = (char) System.in.read();


                    if (ans == 'S') {
                        System.out.println("You've got it right! Bye.");
                    }
            }
        }
}
