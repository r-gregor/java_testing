import java.io.File;

public class dirList {
    public static void main(String[] arg) {
        File dir = new File("ponjave_slike");
        File[] files = dir.listFiles();
        
        // test
        // System.out.println(files);
        for (File f: files) {
            System.out.println(f.getName());
        }
    }
}