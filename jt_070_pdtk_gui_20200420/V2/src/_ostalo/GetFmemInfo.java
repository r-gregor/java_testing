
public class GetFmemInfo {

    // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN
    public static void main(String[] args) {

        //initialize
        Family fm = new Family();

        // run main:
        String usage =  "\n" +
                        "Usage:" +  "\t" + "java GetFmemInfo <name>" + "\n";

        if (args.length != 1) {
            System.out.println("Something went wrong!");
            System.out.println("You have to supply a SINGLE name as parameter.");
            System.out.print(usage);
            System.exit(0);

        } else {
            String pname = args[0];
            fm.printPersonInfo(pname);
        }

        Person found = fm.getPersonInfo("Gregor");
        System.out.println
    } // end main
} // end class
