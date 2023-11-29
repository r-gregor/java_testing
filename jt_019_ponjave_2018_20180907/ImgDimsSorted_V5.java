import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

// NOVO
import java.util.*;
import java.util.Map.Entry;
// NOVO


import java.util.*;
import java.util.Map.Entry;

public class ImgDimsSorted_V5 {
    
    public static int getImgWidth(File f) throws IOException {
        String imgnm = f.getName();
        File imgpth = new File("ponjave_slike/" + imgnm);
        BufferedImage image = ImageIO.read(imgpth);
        int img_width = image.getWidth();
        return img_width;
    }

    public static List<String> getSortedFilesList() throws IOException {
        
        GetDirList dirList = new GetDirList();
        File[] fjlsL = dirList.getFilesList();
        Map<String, Integer> imgs_map_unsort = new HashMap<String, Integer>();
        File[] sorted_fjls;

 
        for (File f: fjlsL) {
            int width = getImgWidth(f);
            
            // Populate hashmap with imagename=width pairs
            String imgnm = f.getName();
            imgs_map_unsort.put(imgnm, width);
        }

        // lisits of keys and values
        List<String> myKeysList = new ArrayList<String>(imgs_map_unsort.keySet());
        List<Integer> myValuesList = new ArrayList<Integer>(imgs_map_unsort.values());

        // sorted SET of values
        TreeSet<Integer> mySetValues = new TreeSet<Integer>(myValuesList);

        // add keys by sorted values to endList
        List<String> endList = new ArrayList<String>();
        for (Integer el : mySetValues) {
            for (Entry<String, Integer> entry : imgs_map_unsort.entrySet()) {
                if (el.equals(entry.getValue())) {
                    String my_val = entry.getKey();
                    endList.add(my_val);
                }
            }
        }
        return endList;
    }

}
