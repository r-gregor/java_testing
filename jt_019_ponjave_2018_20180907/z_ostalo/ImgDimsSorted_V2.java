import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


// NOVO
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

class ImgDimsSorted_V2 {
    
    public static int getImgWidth(File f) throws IOException {
        String imgnm = f.getName();
        File imgpth = new File("ponjave_slike/" + imgnm);
        BufferedImage image = ImageIO.read(imgpth);
        int img_width = image.getWidth();
        return img_width;
    }
    
    public static void printKeys(Map<String, Integer> map) {
        for ( String key : map.keySet() ) {
            System.out.println(key);
        }
    }
    
    
    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }
    
    
    public static void main(String[] args) throws IOException {
        
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
      
        int map_el_count = imgs_map_unsort.size();
        System.out.println("Number of key-value pairs in imgs_map_unsort: " + map_el_count);
        // System.out.println("Unsorted HashMap: " + imgs_map_unsort);
        
        // printKeys(imgs_map_unsort);
        // printMap(imgs_map_unsort);
        
        /*
        //Map<Employee, Integer> map ... original Map that needs to be sorted
        Map<Employee, Integer> sorted = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                Integer o1Value = map.get(o1);
                Integer o2Value = map.get(o2);
                return o1Value.compareTo(o2Value);
            }
        });
        sorted.putAll(map);
        */
        
        System.out.println();
        //Map<String, Integer> imgs_map_unsort ... original Map that needs to be sorted
        Map<String, Integer> imgs_map_sorted = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer o1Value = imgs_map_unsort.get(o1);
                Integer o2Value = imgs_map_unsort.get(o2);
                return o1Value.compareTo(o2Value);
            }
        });
        imgs_map_sorted.putAll(imgs_map_unsort);

        int map_el_count2 = imgs_map_sorted.size();
        System.out.println("Number of key-value pairs in imgs_map_sorted: " + map_el_count2);
        

        //printKeys(imgs_map_sorted);
        // printMap(imgs_map_sorted);

    }
}
