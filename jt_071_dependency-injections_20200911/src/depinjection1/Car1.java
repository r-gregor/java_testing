package depinjection1;

/** NO DEPENDENCY INJECTION */
class Car1 {

    //THIS IS THE REASON!!
    Engine engine = new Engine();

    public void start() {
        engine.turnOn();
    }
}
