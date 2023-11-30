package runme;

public class RunMe {
    public static void main(final String[] args) {
        Source srs = new Source();
        srs.printMe();
        System.out.println("Success!!");
    }
}

class Source {
    public void printMe() {
        System.out.println("Calling in from Source ...");
    }
}