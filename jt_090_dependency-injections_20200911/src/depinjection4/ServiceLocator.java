package depinjection4;

/** DEPENDENCY INJECTION - AUTOMATIC INJECTION WITH SERVICE LOCATOR */
public class ServiceLocator {

    private static ServiceLocator instance = null;

    private ServiceLocator() {}

    public static ServiceLocator getInstance() {
        if (instance == null) {
            synchronized(ServiceLocator.class) {
                instance = new ServiceLocator();
            }
        }
        return instance;
    }

    Engine getEngine() {
        return new Engine();
    }
}

