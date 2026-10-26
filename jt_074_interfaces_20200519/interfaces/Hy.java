package interfaces;

public class Hy {
    public static String lang;

    public Hy(String langs) {
        this.lang = langs;
    }

    public Hy() {
        this.lang = "none";
    }

    public static void main(String[] args) {

    Language newl = new Run("slo");
    newl.saySomething();

    Language ger = new Run("ger");
    ger.saySomething();

    Language empty = new Run();
    empty.saySomething();

    Language eng = new Run("eng");
    eng.saySomething();

    }

}
