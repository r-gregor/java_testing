package depinjection4;

/** DEPENDENCY INJECTION - AUTOMATIC INJECTION WITH SERVICE LOCATOR */
public class Car4 {

    // HERE!!
    private Engine engine = ServiceLocator.getInstance().getEngine();

    public void start() {
        engine.turnOn();
    }
}
