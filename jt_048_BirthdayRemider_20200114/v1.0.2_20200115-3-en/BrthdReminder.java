// BrthdReminder.java
// v1.0.0   (20200114/01/en -- ORIGINAL)
// V1.0.1   (20200114/02/d)
// v1.0.2   (20200115/03/en)


import java.util.*;


import java.io.*;
import java.time.*;
import java.time.temporal.*;
import java.text.SimpleDateFormat;


public class BrthdReminder {

    private String name;
    private String brthdy;
    private String fileName = "ROJSTNIDNEVI.txt";
    private Map<String, String> seznam = new HashMap<String, String>();
    
    // java 8 and up
    private LocalDate today = LocalDate.now();
    private SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    // main ------------------------------------------------------------------
    public static void main(String[] args) throws Exception {

        BrthdReminder brm = new BrthdReminder();
        brm.getInfoFromExtFile();
        brm.ShowInfoFromExtFile(12);


    } // end main ------------------------------------------------------------

    private void getInfoFromExtFile() throws Exception {
        
        // get absolute classpath [classFilePath] --> get "ROJSTNIDNEVI.txt" from classpath
        File inputFile = new File(BrthdReminder.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
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

    private void ShowInfoFromExtFile(int howmany) throws Exception {

        if (howmany >= seznam.size()) {
            howmany = seznam.size();
        }

        int k = 1;
        for (Map.Entry<String, String> entry : seznam.entrySet()) {
            String name = entry.getKey();
            System.out.printf("%-3d- %s => %d%n", k, name, getDateDiff(name));
            k += 1;
            if (k > howmany) {
                break;
            }
        }
    } // end

    private long getDateDiff(String name) throws Exception {
        LocalDate d1 = today;
        String d2 = seznam.get(name);
        String[] d2s = d2.split("\\.");

        int yr = Integer.parseInt(d2s[2]);
        int mn = Integer.parseInt(d2s[1]);
        int dy = Integer.parseInt(d2s[0]);
        int currYr = today.getYear();

        LocalDate nd2 = LocalDate.of(currYr, mn, dy);

        // java 8 and up
        long noOfDaysBetween = ChronoUnit.DAYS.between(d1, nd2);

        long daysInYear = 365;
        boolean isLeapYear = ((currYr % 4 == 0) && (currYr % 100 != 0) || (currYr % 400 == 0));
        
        if (isLeapYear) {
            daysInYear += 1;
        }

        if (noOfDaysBetween < 0 ) {
            noOfDaysBetween += daysInYear;
        }

        return noOfDaysBetween;
    }

} // end class
