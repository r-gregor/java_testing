import java.util.*;
import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.io.IOException;

public class TestFileRead {

    private void printExtFileContents() throws Exception {

        /**
        * vorks with jar but not with java -cp ...
        * String inputFilePath = jarFile.getParent() + File.separator + fileName;
        *                                ===========
        *                                (important gets parent dir of jarfile so it works for jarFile)
        *                                (that is why it is NOT working with java -cp ...)
        *
        * $> rgregor@rgregor-hp [/home/rgregor/JAVA_d_testing/20190703_pdtk_V5_en/src]
        * $> java newPdtk6
        * Exception in thread "main" java.io.FileNotFoundException: /home/rgregor/majfajls/coding/JAVA_d/JAVA_d_testing/20190703_pdtk_V5_en/potnilisti.txt (No such file or directory)
        */
        String fileName = "potnilisti.txt";
        File jarFile = new File(TestFileRead.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
        String inputFilePath = jarFile.getParent() + File.separator + fileName;

        // for java only:
        // String inputFilePath = jarFile + File.separator + fileName;

        // another atempt
        String newpath = System.getProperty("java.class.path");
        System.out.println(newpath);

        System.out.println(inputFilePath);
        FileInputStream inStream = new FileInputStream(new File(inputFilePath));
        BufferedReader br = new BufferedReader(new InputStreamReader(inStream));

        String st = null;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
    }



    // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN
    public static void main(String[] args) throws Exception {

        //initialize
        TestFileRead pd = new TestFileRead();


        // get passport info from external file
        pd.printExtFileContents();

    } // end main
} // end class
