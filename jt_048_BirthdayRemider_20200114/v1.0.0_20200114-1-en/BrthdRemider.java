// BrthdRemider.java

import java.util.*;


import java.io.*;
import java.time.*;
import java.time.temporal.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
// import java.time.temporal.ChronoUnit;


public class BrthdRemider {

    private String name;
    private String brthdy;
    private String fileName = "ROJSTNIDNEVI.txt";
    private Map<String, String> seznam = new HashMap<String, String>();
    // private Date today = Calendar.getInstance().getTime();
    private LocalDate today = LocalDate.now();
    private SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    // main ------------------------------------------------------------------
    public static void main(final String[] args) throws Exception {

        BrthdRemider brm = new BrthdRemider();
        brm.getInfoFromExtFile();
        brm.ShowInfoFromExtFile();

        brm.getDateDiff("Gregor Redelonghi");

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

        /*
        // test
        System.out.print(seznam);
        System.out.println();
        */
    } // end

    private void ShowInfoFromExtFile() {
        for (final Map.Entry<String, String> entry : seznam.entrySet()) {
            System.out.printf("%-30s|%s%n", entry.getKey(), entry.getValue());
        }
    } // end

    private void getDateDiff(String name) throws Exception {
        LocalDate d1 = today;

        String d2 = seznam.get(name);
        System.out.println(d2);
        String[] d2s = d2.split("\\.");

        int yr = Integer.parseInt(d2s[2]);
        int mn = Integer.parseInt(d2s[1]);
        int dy = Integer.parseInt(d2s[0]);
        System.out.printf("Year: %d%n" +
        "Month: %d%n" +
        "Day: %d%n", yr, mn, dy);

        /*
        BRTHDYR --> CURRYR
        DIFF IF - --> +1
        ...
        
        */

            
        // LocalDate d2 = LocalDate.of(Integer.parseInt(d2s[2]), Integer.parseInt(d2s[1]), Integer.parseInt(d2s[0]));
        LocalDate nd2 = LocalDate.of(yr, mn, dy);
        long noOfDaysBetween = ChronoUnit.DAYS.between(d1, nd2);
        System.out.println(noOfDaysBetween);
    }

} // end class
