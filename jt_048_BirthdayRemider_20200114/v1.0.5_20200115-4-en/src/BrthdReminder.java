// BrthdRemider.java
// v1.0.0   (20200114/01/en -- ORIGINAL)
// V1.0.1   (20200114/02/d)
// v1.0.2   (20200115/03/en):
// v1.0.3   (20200115/04/en):
//              - new Person class
//              - all date calculations in Person class
//              - add person info to Person object and add object to ArrayList
//              - added check if person already in a list
//              - added check if person already in a list
// v1.0.4   (20200115/05/d):
//              - added check for command line parameter [part of a name]
//              - 
// v1.0.5   (20200116/06/en):
//              - VSCode suggestion: change as much variables to final as possible
//              - added sorting the seznam2     --> change Person class (getter for diff)
//                                              --> added DiffSorter comparator class
//              - added function to print persons with 50 or less days before RD
//  
// -----------------------------------------------------------------------------------



import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BrthdReminder {

    // constructor
    public BrthdReminder() throws Exception {
        getInfoFromExtFile();
        // System.out.print("\n*** Birthdays acquired from external file ***\n");
    }

    private final String fileName = "ROJSTNIDNEVI.txt";

    private final ArrayList<Person> seznam2 = new ArrayList<Person>();

    // main ------------------------------------------------------------------
    public static void main(final String[] args) throws Exception {

        final BrthdReminder brm = new BrthdReminder();

        String searchName;
        if (args.length == 1) {
            searchName = args[0];
            if (searchName.toUpperCase().equals("ALL")) {
                brm.showInfoAboutPersons(0);
            } else {
                brm.showPerson(searchName);
            }

        } else {
            // brm.showInfoAboutPersons(14);
            brm.showPersonsFiftyDaysOrLess();
        }

    } // end main ------------------------------------------------------------

    private void getInfoFromExtFile() throws Exception {

        // get absolute classpath [classFilePath] --> get "ROJSTNIDNEVI.txt" from
        // classpath
        final File inputFile = new File(BrthdReminder.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());

        // different paths for external file if class or jar file
        String jarFilePath = inputFile.getParent() + File.separator + fileName;
        String classFilePath = inputFile + File.separator + fileName;
        
        String type = BrthdReminder.class.getResource("BrthdReminder.class").toString();
        String mypath = null;
        if (type.startsWith("file")) {
            mypath = classFilePath;
        } else if (type.startsWith("jar")) {
            mypath = jarFilePath;
        } else {
            System.out.println("No suitable file found!");
            System.exit(0);
        }
        
        
        final File myFile = new File(mypath);

        // read ext file as UTF-8 encoded
        // does NOT work on Mintty(cygwin) if UTF-8, bwetter if encoded in ASCII
        // WORKS if run from cmd (WIN)!
        // WORKS in vscode terminal!
        // TEST IN LINUX!!!
        final Reader reader = new InputStreamReader(new FileInputStream(myFile), "UTF-8");

        final BufferedReader br = new BufferedReader(reader);

        String st = null;
        while ((st = br.readLine()) != null) {

            final String[] items = st.split(",");
            final Person person = new Person();
            person.name = items[0];
            person.rd = items[1];
            person.calcDatesAndDiff();

            /*
             * does NOT work if (seznam2.contains(person)) { continue; } else {
             * seznam2.add(person); }
             */
            boolean pExists = false;
            for (int i = 0; i < seznam2.size(); i++) {
                if ((seznam2.get(i).name).equals(person.name)) {
                    // test
                    // System.out.println(person.name + "already in a list!");

                    pExists = true;
                    break;
                }
            }

            if (pExists == false) {
                seznam2.add(person);
            } else {
                continue;
            }

        }
        br.close();

        // ADDED SORTING BY DIFF
        seznam2.sort(new DiffSorter());
    } // end

    // ShowInfoFromExtFile(int howmany):
    // if howmany 0, or greater than elements in a list
    // print all elements

    private void showInfoAboutPersons(int howmany) throws Exception {

        if (howmany >= seznam2.size() || howmany == 0) {
            howmany = seznam2.size();
        }

        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        final LocalDate localDate = LocalDate.now();
        System.out.println("Danes: " + dtf.format(localDate));
        // header
        crt(75);
        System.out.printf("%-5s" + "%-30s" + "%-12s" + "%-12s" + "%-7s" + "%9s" + "%n", "St", "Ime", "RD", "Datum",
                "Let", "Dni do RD");
        crt(75);
        int k = 1;
        for (int i = 0; i < seznam2.size(); i++) {
            final Person el = seznam2.get(i);
            final String dni = Long.toString(el.diff);
            
            String pref = getPref(el);

            System.out.printf("%-5d" + "%-30s" + "%-12s" + "%-12s" + "%-7d" + "%-3s" + "%5s" + "%n", i + 1, el.name,
                    el.rd, el.nrd, el.age, pref, dni);
            k += 1;
            if (k > howmany) {
                break;
            }
        }
        crt(75);
    } // end

    private void showPerson(final String myName) throws Exception {

        boolean hasName = true;
        for (int i = 0; i < seznam2.size(); i++) {
            final Person el2 = seznam2.get(i);
            if (((el2.name.toUpperCase()).contains(myName.toUpperCase()))) {
                hasName = true;
                break;
            } else {
                hasName = false;
                continue;
            }

        }

        if (hasName == false) {
            System.out.printf("No such person whose name contains [%s]!%n", myName);
            return;
        }

        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        final LocalDate localDate = LocalDate.now();
        System.out.println("Danes: " + dtf.format(localDate));

        // header
        crt(75);
        System.out.printf("%-5s" + "%-30s" + "%-12s" + "%-12s" + "%-7s" + "%9s" + "%n", "St", "Ime", "RD", "Datum",
                "Let", "Dni do RD");
        crt(75);
        int k = 1;
        for (int i = 0; i < seznam2.size(); i++) {
            final Person el = seznam2.get(i);
            final String dni = Long.toString(el.diff);
            
            String pref = getPref(el);

            if ((el.name).toUpperCase().contains(myName.toUpperCase())) {
                System.out.printf("%-5d" + "%-30s" + "%-12s" + "%-12s" + "%-7d" + "%-3s" + "%5s" + "%n", k, el.name,
                        el.rd, el.nrd, el.age, pref, dni);
                k += 1;
            } else {
                continue;
            }

        }
        crt(75);
    } // end

    private void showPersonsFiftyDaysOrLess() throws Exception {

        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        final LocalDate localDate = LocalDate.now();
        System.out.println("Danes: " + dtf.format(localDate));

        // header
        crt(75);
        System.out.printf("%-5s" + "%-30s" + "%-12s" + "%-12s" + "%-7s" + "%9s" + "%n", "St", "Ime", "RD", "Datum",
                "Let", "Dni do RD");
        crt(75);
        int k = 1;
        for (int i = 0; i < seznam2.size(); i++) {
            final Person el = seznam2.get(i);
            final String dni = Long.toString(el.diff);
            
            String pref = getPref(el);

            if (el.diff <= 50) {
                System.out.printf("%-5d" + "%-30s" + "%-12s" + "%-12s" + "%-7d" + "%-3s" + "%5s" + "%n", k, el.name,
                        el.rd, el.nrd, el.age, pref, dni);
                k += 1;                        
            } else {
                continue;
            }

        }
        crt(75);
        System.out.println("Prikaz oseb s 50 ali manj dni do RD");
    } // end

    private void crt(final int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private String getPref(Person el) {
        String mypref;
        if (el.diff < 22 && el.diff >= 8) {
            mypref = "*";
        } else if (el.diff < 8 && el.diff > 0) {
            mypref = "**";
        } else if (el.diff == 0) {
            mypref = "***";
        } else {
            mypref = " ";
        }
        return mypref;
    }

} // end class
