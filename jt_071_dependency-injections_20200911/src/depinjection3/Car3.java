package depinjection3;

/** DEPENDENCY INJECTION - FIELD / SETTER INJECTION */
class Car3 {
    private Engine engine;

    // HERE!!
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.turnOn();
    }
}
