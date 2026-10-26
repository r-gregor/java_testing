// filename: ConfigFileTest.java

import java.util.Properties;
import java.io.FileReader;
import java.io.*;

public class ConfigFileTest {

    // external NON-static method to printout data from config files
    // has to be instantiated !!
    void printOut(Properties prop) {
        String name = prop.getProperty("full_name");
        String age = prop.getProperty("age");
        String date = prop.getProperty("date");
        String Yr = date.substring(0, 4);
        String Mn = date.substring(4, 6);
        String Dy = date.substring(6);

        /** test print
        System.out.println(prop);
        */

        System.out.printf("User %s is %s years old! Date entered: %s.%s.%s%n", name, age, Dy, Mn, Yr);

    }

    
    public static void main(String[] argv) {

        // instatiation to access NON-static methods ...
        ConfigFileTest cft = new ConfigFileTest();

        try {
            FileReader reader1 = new FileReader("config1.txt");
            FileReader reader2 = new FileReader("config2.conf");

            Properties props1 = new Properties();
            Properties props2 = new Properties();

            props1.load(reader1);
            props2.load(reader2);

            cft.printOut(props1);
            cft.printOut(props2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
