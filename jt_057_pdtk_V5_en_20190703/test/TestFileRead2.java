import java.util.*;
import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.io.IOException;

public class TestFileRead2 {

    private void printExtFileContents() throws Exception {

        /**
        * vorks with jar but not with java -cp ...
        * String jarFilePath = jarFile.getParent() + File.separator + fileName;
        *                                ===========
        *                                (important gets parent dir of jarfile so it works for jarFile)
        *                                (that is why it is NOT working with java -cp ...)
        *
        * $> rgregor@rgregor-hp [/home/rgregor/JAVA_d_testing/20190703_pdtk_V5_en/src]
        * $> java newPdtk6
        * Exception in thread "main" java.io.FileNotFoundException: /home/rgregor/majstaf/coding/JAVA_d/JAVA_d_testing/20190703_pdtk_V5_en/potnilisti.txt (No such file or directory)
        */
        String fileName = "potnilisti.txt";
        File inputFile = new File(TestFileRead2.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
        
        String jarFilePath = inputFile.getParent() + File.separator + fileName;
        String classFilePath = inputFile + File.separator + fileName;

        // for java only:
        // String jarFilePath = jarFile + File.separator + fileName;
        
        String type = TestFileRead2.class.getResource("TestFileRead2.class").toString();
        String mypath = null;
        if (type.startsWith("file")) {
            mypath = classFilePath;
        } else if (type.startsWith("jar")) {
            mypath = jarFilePath;
        } else {
            System.out.println("No suitable file found!");
            System.exit(0);
        }
        
        
        FileInputStream inStream = new FileInputStream(new File(mypath));
        BufferedReader br = new BufferedReader(new InputStreamReader(inStream));

        String st = null;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
        
    }



    // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN
    public static void main(String[] args) throws Exception {

        //initialize
        TestFileRead2 pd = new TestFileRead2();


        // get passport info from external file
        pd.printExtFileContents();

    } // end main
} // end class
