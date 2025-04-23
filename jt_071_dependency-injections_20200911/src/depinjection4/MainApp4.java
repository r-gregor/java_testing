package depinjection4;

/** DEPENDENCY INJECTION - AUTOMATIC INJECTION WITH SERVICE LOCATOR */
public class MainApp4 {
    public static void main(String[] args) {
        System.out.print("Running car4/start from MainApp4: ");

        // AUTOMATIC INJECTION!!
        Car4 car4 = new Car4();
        car4.start();
    }
}
