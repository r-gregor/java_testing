class StopMe {
    public static void main(String[] args)
        throws java.io.IOException {
            char ans;
            System.out.println("This is StopMe class ... ");
            while (true) {
                System.out.print("Unless you enter the character 'S', this loop will run forever ... ");
                ans = (char) System.in.read();
                
                shift = in.nextInt();
                in.nextLine();
                
                if (ans == 'S') {
                    System.out.println("You've got it right! Bye.");
                    break;
                }
            }
    
        }
}
