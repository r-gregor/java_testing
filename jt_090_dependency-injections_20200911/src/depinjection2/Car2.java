package depinjection2;

/** DEPENDENCY INJECTION - INTO CONSTRUCTOR*/
public class Car2 {
    private final Engine engine;

    // HERE!!
    public Car2(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.turnOn();
    }
}
