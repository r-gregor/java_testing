public class Planeti_TEST_V2 {

    // nested static class (NOT inner)
    static class Planeti {
        String name;
        int radius;

        Planeti(String n, int r) {
            name = n;
            radius = r;
        }
    }

    // added in V2
    static void print_out(Planeti[] planeti) {
        for (Planeti x : planeti) {
            System.out.println(x.name + " "  + x.radius);
        }
        System.out.println("-------------------------------");
    }
    
    
    
    public static void main(String[] args) {
        Planeti[] planeti1 = {new Planeti("Zemlja", 100), new Planeti("Venera", 200), new Planeti("Mars", 300), new Planeti("Jupiter", 400)};

        Planeti[] planeti2 = new Planeti[3];
        int start = 0;

        planeti2[0] = new Planeti("OG1", start + 100);
        planeti2[1] = new Planeti("OG2", start + 200);
        planeti2[2] = new Planeti("OG3", start + 300);

        String[] lune = {"Mesec", "Ios", "Kalisto", "Ganimed", "Europa"};

        Planeti[] planeti3 = new Planeti[lune.length];
        start = 0;

        for (int i = 0; i < lune.length; i++) {
            planeti3[i] = new Planeti(lune[i], start + 1000);
            start += 1000;
        }

        print_out(planeti1);
        
        print_out(planeti2);

        // change second element in planeti2
        System.out.println("Changing second element in planeti2:");
        start = 0;
        planeti2[1] = new Planeti("OG2 (changed)", start + 2000);

        print_out(planeti2);

        print_out(planeti3);

        // classic way of printing an array
        for (int j = 0; j < planeti3.length; j++) {
            System.out.println(planeti3[j].name + " "  + planeti3[j].radius);
        }
        System.out.println("-------------------------------");

    }
}
