package depinjection2;

/** DEPENDENCY INJECTION - INTO CONSTRUCTOR*/
class Car2 {
    private Engine engine;

    // HERE!!
    public Car2(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.turnOn();
    }
}
