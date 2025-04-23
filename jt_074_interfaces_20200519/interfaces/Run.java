package interfaces;

// import java.util.*;

public class Run implements Language {
    String lang;

    public Run() {}

    public Run(String lang) {
        this.lang = lang;

    }

    public void saySomething() {
       
        if (this.lang == "ger" ) {
            System.out.println(this.lang + ": Gutten Morgen Wie geht es Innen heute?");
        } else if (this.lang == "eng" ) {
            System.out.println(this.lang + ": Good morning. How are you today?");
        } else {
            System.out.println(this.lang + ": UNKNOWN language!");
        }
    }

}