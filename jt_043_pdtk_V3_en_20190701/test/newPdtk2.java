import java.util.*;

public class newPdtk2 {
    
    
    /** print2_ALL
    *   
    */
    public static void print2_ALL(List<Person> lmembers) {
        print_inline_header();
        for (Person person: lmembers) {
            person.print_person_inline();
        }
    }

    public static void print_inline_header() {
        System.out.printf("%-12s%-20s%-12s%-17s%-10s%-11s%-12s%-11s\n", "Ime",
                                                                        "Priimek",
                                                                        "RD",
                                                                        "EMSO",
                                                                        "DS",
                                                                        "PL",
                                                                        "PL_do",
                                                                        "ZZZS");
    }
    
    public static Person check_name(String name, List<Person> lmembers) {
        for (Person person : lmembers) {
            if (person.Ime.toUpperCase().equals(name.toUpperCase())) {
                return person;
            }
        } // end for
        
        System.out.printf("No such person: %s!%n", name);
        return null;
    }
    
    // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN     
    public static void main(String[] args) {
        
        // create Person objects -- family members
        Person Gregor = new Person("Gregor", "Redelonghi", "1968-02-22", "2202968500812", "78402069", "PB0572199", "2022-03-22", "035178605");
        Person Tadeja = new Person("Tadeja", "Mali Redelonghi", "1970-01-19", "1901970505327", "43936954", "PB0572172", "2022-03-22", "035718997");
        Person Zala = new Person("Zala", "Redelonghi", "1996-05-07", "0705996505255", "86319515", "PB0572195", "2017-03-22", "043182009");
        Person Mark = new Person("Mark", "Redelonghi", "1999-04-17", "1704999500073", "24626180", "PB0898323", "2019-04-08", "044752609");
        Person Spela = new Person("Spela", "Redelonghi", "2008-02-11", "1102008505293", "51275317", "PB0491825", "2016-04-07", "048275498");

        
        /** Add members objects to ArrayList lmembers */
        List<Person> lmembers = new ArrayList<Person>();
        lmembers.add(Gregor);
        lmembers.add(Tadeja);
        lmembers.add(Zala);
        lmembers.add(Mark);
        lmembers.add(Spela);
        
        // run main:
        String usage =  "\n" +
                        "Usage:" +  "\t" + "java newPdtk [-p] <name>" + "\n" +
                                    "\t" + "-p ... if you want to change PassPort info"+ "\n" +
                                    "\t" + "       for <name> (must not be ALL)" + "\n";
        String name = null;
        Person myperson = null;

        if (args.length == 0 || args.length > 2) {
            System.out.println("Something went wrong!");
            System.out.println("You have to supply a SINGLE name or all/ALL as parameter.");
            System.out.print(usage);
            System.exit(0);
            
        } else if (args.length == 2) {
            if (!args[0].toUpperCase().equals("-P") || args[1].toUpperCase().equals("ALL")) {
                System.out.printf("Wrong switch for name %s%n", args[1]);
                System.out.print(usage);
                System.exit(0);
            } else {
                name = args[1];
                myperson = check_name(name, lmembers);
                if (myperson != null) {
                    System.out.printf("Printing info for %s%n", myperson.Ime);
                    myperson.print_person_info();
                    
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter PassPort number:");
                    String PP = sc.nextLine();
                    System.out.println("Enter PassPort expiration date [YYYY-mm-dd]:");
                    String PD = sc.nextLine();
                    System.out.printf("%nChanging PassPort info for %s%n", myperson.Ime);
                    myperson.set_PL(PP, PD);
                    // myperson.print_person_info();
                }
            }

        } else {
            name = args[0];
        }

        System.out.println();
        // if name == ALL --> print all
        if (name.toUpperCase().equals("ALL")) {
            System.out.println("Printing info for ALL:");
            print2_ALL(lmembers);
            System.exit(0);
        }
        
        myperson = check_name(name, lmembers);
        if (myperson != null) {
            System.out.printf("Printing info for %s%n", myperson.Ime);
            myperson.print_person_info();
        }

    } // end main
} // end class 
