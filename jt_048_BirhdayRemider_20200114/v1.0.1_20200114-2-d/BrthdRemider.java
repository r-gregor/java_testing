// BrthdRemider.java
// v1.0.0   (20200114/01/en -- ORIGINAL)
// V1.0.1   (20200114/02/d)


import java.util.*;


import java.io.*;
import java.time.*;
import java.time.temporal.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class BrthdRemider {

    private String name;
    private String brthdy;
    private String fileName = "ROJSTNIDNEVI.txt";
    private Map<String, String> seznam = new HashMap<String, String>();
    
    // java 8 and up
    private LocalDate today = LocalDate.now();
    private SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    // main ------------------------------------------------------------------
    public static void main(String[] args) throws Exception {

        BrthdRemider brm = new BrthdRemider();
        brm.getInfoFromExtFile();
        
        // test
        /*
        brm.ShowInfoFromExtFile();
        */

        System.out.printf("%s => %d%n","Gregor Redelonghi", brm.getDateDiff("Gregor Redelonghi"));
        
        int k = 0;
        for (Map.Entry<String, String> entry : brm.seznam.entrySet()) {
            k += 1;
            String name = entry.getKey();
            System.out.printf("%s => %d%n",name, brm.getDateDiff(name));
            if (k > 5) {
                break;
            }
        }



    } // end main ------------------------------------------------------------

    private void getInfoFromExtFile() throws Exception {
        
        // get absolute classpath [classFilePath] --> get "ROJSTNIDNEVI.txt" from classpath
        File inputFile = new File(BrthdRemider.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
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
            name = items[0];
            brthdy = items[1];

            if (seznam.containsKey(name)) {
                // test
                System.out.printf("%s allready in list!%n", name);
                continue;
            } else {
                seznam.put(name, brthdy);
            }
        }

    } // end

    private void ShowInfoFromExtFile() {
        for (Map.Entry<String, String> entry : seznam.entrySet()) {
            System.out.printf("%-30s|%s%n", entry.getKey(), entry.getValue());
        }
    } // end

    private long getDateDiff(String name) throws Exception {
        LocalDate d1 = today;

        String d2 = seznam.get(name);
        
        // test
        /*
        System.out.println(d2);
        */

        String[] d2s = d2.split("\\.");

        int yr = Integer.parseInt(d2s[2]);
        int mn = Integer.parseInt(d2s[1]);
        int dy = Integer.parseInt(d2s[0]);


        // test
        /*
        System.out.printf("Year: %d%n" +
        "Month: %d%n" +
        "Day: %d%n", yr, mn, dy);
        */
        int currYr = today.getYear();
        
        // test
        /*
        System.out.printf("Current year: %d%n", currYr);
        */

        LocalDate nd2 = LocalDate.of(currYr, mn, dy);

        long noOfDaysBetween = ChronoUnit.DAYS.between(d1, nd2);

        boolean isLeapYear = ((currYr % 4 == 0) && (currYr % 100 != 0) || (currYr % 400 == 0));
        long daysInYear = 365;

        if (isLeapYear) {
            daysInYear += 1;
        }

        if (noOfDaysBetween < 0 ) {
            noOfDaysBetween += daysInYear;
        }

        return noOfDaysBetween;
    }

} // end class
