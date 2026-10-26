import java.io.File;

public class GetDirList {
    public File[] getFilesList() {
        File dir = new File("ponjave_slike");
        File[] files = dir.listFiles();
        return files;
    }
}
