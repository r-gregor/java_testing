import java.util.*;
import java.io.*;
import java.net.URL;
import java.nio.file.*;

public class newPdtk5 {
    
    // default values
    private String gregor_PL = "PB0572199";
    private String gregor_PL_do ="2022-03-22";
    private String tadeja_PL = "PB0572172";
    private String tadeja_PL_do = "2022-03-22";
    private String zala_PL = "PB0572195";
    private String zala_PL_do = "2017-03-22";
    private String mark_PL = "PB0898323";
    private String mark_PL_do = "2019-04-08";
    private String spela_PL = "PB0491825";
    private String spela_PL_do = "2016-04-07";
    
    private File file = new File("potnilisti.txt");
    
        
    private List<Person> lmembers = new ArrayList<Person>();
    
    /**
     * sets values for pasport and expiration date for each member
     * gets values from external file "potnilisti.txt" (UTF-8 encoded!)
     * 
     * 
     */
    private void getExtInfo() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = null;
        while ((st = br.readLine()) != null) {
            String[] items = st.split(",");

            switch(items[0].toUpperCase()) {
                case "GREGOR":
                    gregor_PL = items[1];
                    gregor_PL_do = items[2];
                    break;
                    
                case "TADEJA":
                    tadeja_PL = items[1];
                    tadeja_PL_do = items[2];
                    break;
                    
                case "ZALA":
                    zala_PL = items[1];
                    zala_PL_do = items[2];
                    break;
                    
                case "MARK":
                    mark_PL = items[1];
                    mark_PL_do = items[2];
                    break;
                    
                case "SPELA":
                    spela_PL = items[1];
                    spela_PL_do = items[2];
                    break;

                default:
                    ;
            }
        }
    }

    
    /**
     * print out a table for all members
     * formated as inline rows
     */
    private void print2_ALL() {
        print_inline_header();
        for (Person person: lmembers) {
            person.print_person_inline();
        }
    }
    
    /**
     * print inline header for print2_ALL
     */
    private void print_inline_header() {
        System.out.printf("%-12s%-20s%-12s%-17s%-10s%-11s%-12s%-11s\n", "Ime",
                                                                        "Priimek",
                                                                        "RD",
                                                                        "EMSO",
                                                                        "DS",
                                                                        "PL",
                                                                        "PL_do",
                                                                        "ZZZS");
    }
    
    /**
     * checks if name is in lmembers list
     */
    public Person check_name(String name) {
        for (Person person : lmembers) {
            if (person.Ime.toUpperCase().equals(name.toUpperCase())) {
                return person;
            }
        } // end for
        
        System.out.printf("No such person: %s!%n", name);
        return null;
    }
    
    // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN     
    public static void main(String[] args) throws Exception {

        //initialize
        newPdtk5 pd = new newPdtk5();
        
        
        // get passport info from external file
        pd.getExtInfo();
        
        // create Person objects -- family members
        Person Gregor = new Person("Gregor", "Redelonghi", "1968-02-22", "2202968500812", "78402069", pd.gregor_PL, pd.gregor_PL_do, "035178605");
        Person Tadeja = new Person("Tadeja", "Mali Redelonghi", "1970-01-19", "1901970505327", "43936954", pd.tadeja_PL, pd.tadeja_PL_do, "035718997");
        Person Zala = new Person("Zala", "Redelonghi", "1996-05-07", "0705996505255", "86319515", pd.zala_PL, pd.zala_PL_do, "043182009");
        Person Mark = new Person("Mark", "Redelonghi", "1999-04-17", "1704999500073", "24626180", pd.mark_PL, pd.mark_PL_do, "044752609");
        Person Spela = new Person("Spela", "Redelonghi", "2008-02-11", "1102008505293", "51275317", pd.spela_PL, pd.spela_PL_do, "048275498");

        
        // Add members objects to ArrayList lmembers
        // List<Person> lmembers = new ArrayList<Person>();
        pd.lmembers.add(Gregor);
        pd.lmembers.add(Tadeja);
        pd.lmembers.add(Zala);
        pd.lmembers.add(Mark);
        pd.lmembers.add(Spela);
        
        // run main:
        String usage =  "\n" +
                        "Usage:" +  "\t" + "java newPdtk4 [-p] <name>" + "\n" +
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
                myperson = pd.check_name(name);
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
            pd.print2_ALL();
            System.exit(0);
        }
        
        myperson = pd.check_name(name);
        if (myperson != null) {
            System.out.printf("Printing info for %s%n", myperson.Ime);
            myperson.print_person_info();
        }

    } // end main
} // end class 
