public class Planeti_TEST {


    static class Planet {
        String name;
        int radius;

        Planet(String n, int r) {
            name = n;
            radius = r;
        }
    }

    public static void main(String[] args) {
        Planet[] planeti = {new Planet("Zemlja", 100), new Planet("Venera", 200), new Planet("Mars", 300), new Planet("Jupiter", 400)};

        Planet[] planeti2 = new Planet[3];
        int start = 0;

        planeti2[0] = new Planet("OG1", start + 100);
        planeti2[1] = new Planet("OG2", start + 200);
        planeti2[2] = new Planet("OG3", start + 300);

        String[] lune = {"Mesec", "Ios", "Kalisto", "Ganimed", "Europa"};

        Planet[] planeti3 = new Planet[lune.length];
        start = 0;

        for (int i = 0; i < lune.length; i++) {
            planeti3[i] = new Planet(lune[i], start + 1000);
            start += 1000;
        }

        for (Planet x : planeti) {
            System.out.println(x.name + " "  + x.radius);
        }
        System.out.println("-------------------------------");

        for (Planet y : planeti2) {
            System.out.println(y.name + " "  + y.radius);
        }
        System.out.println("-------------------------------");

        start = 0;
        planeti2[1] = new Planet("OG2", start + 2000);

        for (Planet y : planeti2) {
            System.out.println(y.name + " "  + y.radius);
        }
        System.out.println("-------------------------------");

        for (Planet z : planeti3) {
            System.out.println(z.name + " "  + z.radius);
        }
        System.out.println("-------------------------------");

        for (int j = 0; j < planeti3.length; j++) {
            System.out.println(planeti3[j].name + " "  + planeti3[j].radius);
        }
        System.out.println("-------------------------------");

    }
}
