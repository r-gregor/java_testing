package bike_repair_3;
import java.util.*;

public class TestItemsRepairList3 {
    
    public static void main(String[] argv) {
        
        // instanstiate BikeRepairOrder3 object
        BikeRepairOrder3 bro3 = new BikeRepairOrder3();
        
        // initialize Grand Total
        Double Gtotal = 0.0;
        
        // map<K, V> = bro3.get_order_items()
        // K = bro3.get_order_items().entrySet().getKey()
        // V = bro3.get_order_items().entrySet().getValue()
        for (Map.Entry<String, Integer> entry : bro3.get_order_items().entrySet()) {
            Gtotal += print_out(entry.getKey(), entry.getValue());
        }
        
        System.out.printf(  "%n" + 
                            "========================" + 
                            "%n" +
                            "%-12s%12.2f%n" +
                            "========================" + 
                            "%n", "Grand total:", Gtotal);
    } // END main

    
    public static Double print_out(String item, int quantity) {
        Double total = 0.0;
        ItemsPriceList3 itm3 = new ItemsPriceList3();
        
        Double price3 = itm3.get_items_plist().get(item);
        
        if (price3 == null) {
            total = 0.0;
            System.out.printf("%n" + "*** %s not in the price list! ***" + "%n", item);
        } else {
        total = price3 * quantity;
        
        System.out.printf(  "%n" +
                            "%-12s%12s%n" +
                            "%-12s%12.2f%n" +
                            "%-12s%12d%n" + 
                            "------------------------%n" +
                            "%-12s%12.2f%n", "Item:", item, "Price/qnt:", price3, "Quantity:", quantity, "Total:", total);
        }
        return total;

    } // END print_out
    
} // end TestItemsRepairList3 class