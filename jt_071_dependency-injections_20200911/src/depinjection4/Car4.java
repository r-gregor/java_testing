package depinjection4;

/** DEPENDENCY INJECTION - AUTOMATIC INJECTION WITH SERVICE LOCATOR */
class Car4 {

    // HERE!!
    private Engine engine = ServiceLocator.getInstance().getEngine();

    public void start() {
        engine.turnOn();
    }
}
