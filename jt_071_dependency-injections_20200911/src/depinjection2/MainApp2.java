package depinjection2;

/** DEPENDENCY INJECTION - INTO CONSTRUCTOR*/
public class MainApp2 {
    public static void main(String[] args) {
        System.out.print("Running car2/start from MainApp2: ");

        // HERE!!
        Car2 car2 = new Car2(new Engine());
        /* OR
         * Engine engine2 = new Engine();
         * Car2 car2 = new Car2(engine2);
         */

        car2.start();
    }
}
