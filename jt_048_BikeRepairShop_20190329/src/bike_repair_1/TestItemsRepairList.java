package bike_repair_1;
public class TestItemsRepairList {
    
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
        ItemsPriceList itm = new ItemsPriceList();
        Double price = itm.itemPrice(item);
        
        if (price == null) {
            total = 0.0;
        } else {
        total = price * quantity;
        
        System.out.printf(  "%n" +
                            "%-12s%12s%n" +
                            "%-12s%12.2f%n" +
                            "%-12s%12d%n" + 
                            "------------------------%n" +
                            "%-12s%12.2f%n", "Item:", item, "Price/qnt:", price, "Quantity:", quantity, "Total:", total);
        }
        return total;

    }
}