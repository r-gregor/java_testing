class CliArgsTest {
    static public void main(String[] args) {
        int a_ln = args.length;
        if (a_ln == 0) {
            System.out.println("There are no args passed to this class.");
        } else {
            System.out.println("This args were passed to this class:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        }
        
    }
    
}