import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


// NOVO
// import com.google.common.collect.Maps;
// import com.google.common.collect.Ordering;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
// NOVO

class ImgDimsSorted {

    public static void main(String[] args) {
        
        GetDirList dirList = new GetDirList();
        File[] fjlsL = dirList.getFilesList();
        Map<String, Integer> imgs_map_unsort = new HashMap<String, Integer>();
        File[] sorted_fjls;
        
        try {
            
            for (File f: fjlsL) {
                String imgnm = f.getName();
                File imgpth = new File("ponjave_slike/" + imgnm);
                BufferedImage image = ImageIO.read(imgpth);
                int height = image.getHeight();
                int width = image.getWidth();
                
                // System.out.println(imgnm + " - (Height:" + height + ", Width:" + width + ")");
                // System.out.println("[" + imgnm + ", " + height + "]");
                
                // Populate hashmap with imagename=width pairs
                imgs_map_unsort.put(imgnm, width);
    
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        int map_el_count = imgs_map_unsort.size();
        System.out.println("Number of key-value pairs in imgs_ap_unsort: " + map_el_count);
        System.out.println("Unsorted HashMap: " + imgs_map_unsort);
    }
}
