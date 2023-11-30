// filename: BikeRepairOrder3.java
package bike_repair_3;
import java.util.*;

public class BikeRepairOrder3 {
    
    Map<String, Integer> items_order = new HashMap<String, Integer>();
    
    Map<String, Integer> get_order_items() {
        items_order.put("rear light", 1);
        items_order.put("Bouden", 2);
        items_order.put("front gear", 1);
        items_order.put("mudguard", 2);
        items_order.put("derilluer", 2);
        items_order.put("brake", 4);
        items_order.put("rear gear", 1);
        
        return items_order;
    }
        
} // END class BikeRepairOrder