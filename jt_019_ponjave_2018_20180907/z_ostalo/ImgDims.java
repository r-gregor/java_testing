import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class ImgDims {

    public static void main(String[] args) {
        
        GetDirList dirList = new GetDirList();
        File[] fjlsL = dirList.getFilesList();
        
        try {
            
            for (File f: fjlsL) {
                String imgnm = f.getName();
                File imgpth = new File("ponjave_slike/" + imgnm);
                BufferedImage image = ImageIO.read(imgpth);
                int height = image.getHeight();
                int width = image.getWidth();
                
                // System.out.println(imgnm + " - (Height:" + height + ", Width:" + width + ")");
                System.out.println("[" + imgnm + ", " + height + "]");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
