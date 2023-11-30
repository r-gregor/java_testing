// filename ItemsPriceList2.java
package bike_repair_2;
import java.util.*;

class ItemsPriceList2 {
    private Map<String, Double> items_plist = new HashMap<String, Double>();

    Map<String, Double> get_items_plist() {
        items_plist.put("frame", 75.50);
        items_plist.put("wheel", 25.80);
        items_plist.put("seat", 19.20);
        items_plist.put("front light", 9.85);
        items_plist.put("rear light", 8.15);
        items_plist.put("front gear", 20.00);
        items_plist.put("rear gear", 25.20);
        items_plist.put("brake", 18.50);
        items_plist.put("mudguard", 14.70);
    
        return items_plist;
    }

} // end ItemsPriceList2 class
