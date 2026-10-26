package bike_repair_2;
import java.util.*;

public class TestItemsRepairList2 {
    
    public static void main(String[] argv) {
        Double Gtotal = 0.0;
        
        
        Gtotal += print_out("rear light", 1);
        Gtotal += print_out("Bouden", 2);
        Gtotal += print_out("front gear", 1);
        Gtotal += print_out("mudguard", 2);
        Gtotal += print_out("derilluer", 2);
        Gtotal += print_out("brake", 4);
        System.out.printf(  "========================%n" +
                            "%-12s%12.2f%n" +
                            "========================%n", "Grand total:", Gtotal);
    }

    
    public static Double print_out(String item, int quantity) {
        Double total = 0.0;
        ItemsPriceList2 itm2 = new ItemsPriceList2();
        
        Double price2 = itm2.get_items_plist().get(item);
        
        if (price2 == null) {
            total = 0.0;
            System.out.printf("%n" + "*** %s not in the price list! ***" + "%n", item);
        } else {
        total = price2 * quantity;
        
        System.out.printf(  "%n" +
                            "%-12s%12s%n" +
                            "%-12s%12.2f%n" +
                            "%-12s%12d%n" + 
                            "------------------------%n" +
                            "%-12s%12.2f%n", "Item:", item, "Price/qnt:", price2, "Quantity:", quantity, "Total:", total);
        }
        return total;

    }
}