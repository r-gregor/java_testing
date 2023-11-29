// filename: FormatedStringsTest.java

public class FormatedStringsTest {
    public static void main(String[] argv) {
        int precission = 3;
        int width = 20;
        String nm = "Gregor Redelonghi, the great, III.";
        
        
        System.out.printf("[ " + "%" + width + "." + precission + "f" + " ]" + "%n", 123456.567892F );
        System.out.printf("[ %" + width + "s ]" + "%n", "Kr Neki!");
        
        System.out.println("\n");
        
        System.out.printf("[ " + "%-" + width + "." + precission + "f" + " ]" + "%n", 123456.567892F );
        System.out.printf("[ %-" + width + "s ]" + "%n", "Kr Neki!");
        
        System.out.println("\n");
        
        System.out.printf("[ " + "%-" + width + "." + precission + "f" + " ]" + ", %s " + "%n", 123456.567892F, "Noch ein bisschen text ..." );
        System.out.printf("[ %-" + width + "s ]" + ", Ime: %s" + "%n", "Kr Neki!", nm);

    }
}
