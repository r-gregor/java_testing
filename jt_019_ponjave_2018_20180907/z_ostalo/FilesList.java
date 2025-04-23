import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FilesList {
    
    public static String head =   "<html>\n"
                                + "<head></head>\n"
                                + "<body>\n"
                                + "<h2>Ponjave 2018</h2>\n"
                                + "\n"
                                + "<p>\n";
                            
    public static String foot =   "</p>\n"
                                + "\n"
                                + "</body>\n"
                                + "</html>\n";
                            
    
    public static void main(String[] arg) throws FileNotFoundException {
        
        GetDirList dirList = new GetDirList();
        File[] fjlsL = dirList.getFilesList();
        File fjl = new File("ponjave_slike_jv_20180703.html");
        
        // print the HTML header
        System.out.print(head);
        
        // print the list of fileas as images in HTML
        for (File f: fjlsL) {
            System.out.print("<img src=\"ponjave_slike/" + f.getName() + "\"></img>&nbsp\n");
        }
        
        // print the HTML footer
        System.out.print(foot);
            
            
        System.out.println("\nWriting to a file: " + fjl + "...\n");
        
        /*
        try {
            // File fjl = new File("ponjave_slike_jv_20180703.html");
            PrintWriter wrtfjl = new PrintWriter(fjl);
            
            wrtfjl.print(head);
            
            for (File f: fjlsL) {
                wrtfjl.print("<img src=\"ponjave_slike/" + f.getName() + "\"></img>&nbsp\n");
            }
            
            wrtfjl.print(foot);
            
            wrtfjl.close();
            
        } catch (FileNotFoundException e1) {
           System.out.println("Exception thrown  :" + e1); 
            
        }
        */
        
        PrintWriter wrtfjl = new PrintWriter(fjl);
        wrtfjl.print(head);
        
        for (File f: fjlsL) {
            wrtfjl.print("<img src=\"ponjave_slike/" + f.getName() + "\"></img>&nbsp\n");
        }
        
        wrtfjl.print(foot);
        wrtfjl.close();
        
        
        
    }
}