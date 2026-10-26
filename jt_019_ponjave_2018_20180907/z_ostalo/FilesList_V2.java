import java.io.File;
import java.io.PrintWriter;             
import java.io.FileNotFoundException;   // nedded for PrintWriter (to file)

class FilesList_V2 {
    
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
            
    GetDirList dirList = new GetDirList();
    File[] fjlsL = dirList.getFilesList();
    File fjl = new File("ponjave_slike_jv_V2_20180703.html");
    
    
    // function to print html code to console
    void displayHtml() {
        System.out.print(head);
        for (File f: fjlsL) {
            System.out.print("<img src=\"ponjave_slike/" + f.getName() + "\"></img>&nbsp\n");
        }
        System.out.print(foot);
    }
    
    
    // function to print html code to file
    void printToFile() throws FileNotFoundException {
        System.out.println("\nWriting to a file: " + fjl + " ...\n");
        PrintWriter wrtfjl = new PrintWriter(fjl);
        wrtfjl.print(head);
    
        for (File f: fjlsL) {
            wrtfjl.print("<img src=\"ponjave_slike/" + f.getName() + "\"></img>&nbsp\n");
        }
    
        wrtfjl.print(foot);
        wrtfjl.close();
    }

    
    // MAIN
    public static void main(String[] arg) throws FileNotFoundException {
        
        // instanstiate a class
        FilesList_V2 fl2 = new FilesList_V2();
        
        // display html code in console
        // fl2.displayHtml();
        
        // print html code to file
        fl2.printToFile();

    } // end MAIN
}