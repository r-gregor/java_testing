
public class GetFmemInfo3 {

    // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN
    public static void main(String[] args) {

        //initialize
        Family3 fm3 = new Family3();

        // run main:
        String usage =  "\n" +
                        "Usage:" +  "\t" + "java GetFmemInfo3 <name>" + "\n";

        if (args.length != 1) {
            System.out.println("Something went wrong!");
            System.out.println("You have to supply a SINGLE name as parameter.");
            System.out.print(usage);
            System.exit(0);

        } else {
            String pname = args[0];
            fm3.printPersonInfo(pname);
        }

    } // end main
} // end class
