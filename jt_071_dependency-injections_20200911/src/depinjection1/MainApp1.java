package depinjection1;

/** NO DEPENDENCY INJECTION */
public class MainApp1 {
    public static void main(String[] args) {
        System.out.print("Running car1/start from MainApp1: ");
        Car1 car1 = new Car1();
        car1.start();
    }
}
