import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class Test {

    String head =      "<html>\n"
                        + "<head></head>\n"
                        + "<body>\n"
                        + "<h2>Ponjave 2018</h2>\n"
                        + "\n"
                        + "<p>\n";
                                    
    String foot =      "</p>\n"
                        + "\n"
                        + "</body>\n"
                        + "</html>\n";
    
    List<String> getFNames() throws IOException {
        List<String> fjls_List;
        ImgDimsSorted_V5 imgs = new ImgDimsSorted_V5();
        fjls_List = imgs.getSortedFilesList();
        return fjls_List;
    }
                    

    File fjl = new File("ponjave_slike_jv_V5_20180704.html");

    // function to print html code to console
    void displayHtml() throws IOException {
        
        List<String> fjlsnms = getFNames();
        
        System.out.print(head);
        for (String f: fjlsnms) {
            System.out.print("<img src=\"ponjave_slike/" + f + "\"></img>&nbsp\n");
        }
        System.out.print(foot);
    }
    
    
    // function to print html code to file
    void printToFile() throws FileNotFoundException, IOException {
        List<String> fjlsnms = getFNames();
        
        System.out.println("\nWriting to a file: " + fjl + " ...\n");
        PrintWriter wrtfjl = new PrintWriter(fjl);
        wrtfjl.print(head);
        
        for (String f: fjlsnms) {
            wrtfjl.print("<img src=\"ponjave_slike/" + f + "\"></img>&nbsp\n");
        }
    
        wrtfjl.print(foot);
        wrtfjl.close();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
    
    Test T1 = new Test();
    T1.displayHtml();
    T1.printToFile();

    }
}
