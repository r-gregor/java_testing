package depinjection3;

/** DEPENDENCY INJECTION - FIELD / SETTER INJECTION */
public class MainApp3 {
    public static void main(String[] args) {
        System.out.print("Running car3/start from MainApp3: ");
        Car3 car3 = new Car3();

        // HERE!!
        car3.setEngine(new Engine());
        car3.start();
    }
}
