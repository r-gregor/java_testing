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


import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BrthdReminder {

    private String fileName = "ROJSTNIDNEVI.txt";

    // v1.0.3
    private ArrayList<Person> seznam2 = new ArrayList<Person>();

    // main ------------------------------------------------------------------
    public static void main(String[] args) throws Exception {

        BrthdReminder brm = new BrthdReminder();
        brm.getInfoFromExtFile();
        // brm.showInfoAboutPersons(14);

        String searchName;
        if (args.length == 1) {
            searchName = args[0];
            if ( searchName.toUpperCase().equals("ALL") ) {
                brm.showInfoAboutPersons(0);
            } else {
                brm.showPerson(searchName);
            }
            
        } else {
            brm.showInfoAboutPersons(14);
        }
        
    } // end main ------------------------------------------------------------

    private void getInfoFromExtFile() throws Exception {

        // get absolute classpath [classFilePath] --> get "ROJSTNIDNEVI.txt" from
        // classpath
        File inputFile = new File(
                BrthdReminder.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
        String classFilePath = inputFile + File.separator + fileName;

        // File myFile = new File("ROJSTNIDNEVI.txt");
        File myFile = new File(classFilePath);

        // read ext file as UTF-8 encoded
        // does NOT work on Mintty(cygwin) if UTF-8, bwetter if encoded in ASCII
        // WORKS if run from cmd (WIN)!
        // WORKS in vscode terminal!
        // TEST IN LINUX!!!
        Reader reader = new InputStreamReader(new FileInputStream(myFile), "UTF-8");

        BufferedReader br = new BufferedReader(reader);

        String st = null;
        while ((st = br.readLine()) != null) {

            String[] items = st.split(",");
            Person person = new Person();
            person.name = items[0];
            person.rd = items[1];
            person.calcDatesAndDiff();

            /* does NOT work
            if (seznam2.contains(person)) {
                continue;
            } else {
                seznam2.add(person);
            }
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
    } // end

    
    // ShowInfoFromExtFile(int howmany):
    //      if howmany 0, or greater than elements in a list
    //      print all elements
    
    private void showInfoAboutPersons(int howmany) throws Exception {

        if (howmany >= seznam2.size() || howmany == 0) {
            howmany = seznam2.size();
        }

        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	    LocalDate localDate = LocalDate.now();
        System.out.println("Danes: " + dtf.format(localDate));
        // header
        crt(75);
        System.out.printf("%-5s" + "%-30s" + "%-12s" + "%-12s" + "%-7s" + "%9s" + "%n", "St", "Ime", "RD", "Datum",
                "Let", "Dni do RD");
        crt(75);
        int k = 1;
        for (int i = 0; i < seznam2.size(); i++) {
            Person el = seznam2.get(i);
            String dni = Long.toString(el.diff);
            String pref;
            if (el.diff < 50 && el.diff != 0) {
                pref = "*";
            } else if (el.diff < 50 && el.diff == 0) {
                pref = "***";
            } else {
                pref = " ";
            }

            System.out.printf("%-5d" + "%-30s" + "%-12s" + "%-12s" + "%-7d" + "%-3s" + "%5s" + "%n", i + 1, el.name, el.rd,
            el.nrd, el.age, pref, dni);
            k += 1;
            if (k > howmany) {
                break;
            }
        }
        crt(75);
    } // end
    

    // NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO 
    private void showPerson(String myName) throws Exception {
        
        boolean hasName = true;
        for (int i = 0; i < seznam2.size(); i++) {
            Person el2 = seznam2.get(i);
            if ( ((el2.name.toUpperCase()).contains(myName.toUpperCase())) ) {
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


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	    LocalDate localDate = LocalDate.now();
        System.out.println("Danes: " + dtf.format(localDate));

   
        // header
        crt(75);
        System.out.printf("%-5s" + "%-30s" + "%-12s" + "%-12s" + "%-7s" + "%9s" + "%n", "St", "Ime", "RD", "Datum",
                "Let", "Dni do RD");
        crt(75);
        int k = 1;
        for (int i = 0; i < seznam2.size(); i++) {
            Person el = seznam2.get(i);
            String dni = Long.toString(el.diff);
            String pref;
            if (el.diff < 50 && el.diff != 0) {
                pref = "*";
            } else if (el.diff < 50 && el.diff == 0) {
                pref = "***";
            } else {
                pref = " ";
            }

            if ( (el.name).toUpperCase().contains(myName.toUpperCase()) ) {
                System.out.printf("%-5d" + "%-30s" + "%-12s" + "%-12s" + "%-7d" + "%-3s" + "%5s" + "%n", k, el.name, el.rd, el.nrd, el.age, pref, dni);
                k +=1;
            } else {
                continue;
            }

        }
        crt(75);
    } // end
    // NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO NOVO 


    private void crt(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
} // end class
