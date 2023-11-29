import java.util.*;
import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.io.IOException;

public class Family {

    // default values
    private String gregor_PL = "PB0572199";
    private String gregor_PL_do ="2022-03-22";
    private String tadeja_PL = "PB0572172";
    private String tadeja_PL_do = "2022-03-22";
    private String zala_PL = "PB0572195";
    private String zala_PL_do = "2017-03-22";
    private String mark_PL = "PB0898323";
    private String mark_PL_do = "2019-04-08";
    private String spela_PL = "PB0491825";
    private String spela_PL_do = "2016-04-07";

    String name = null;
    Person myperson = null;

    ArrayList<Person> lmembers = new ArrayList<Person>();

    public Family() {
        // create Person objects -- family members
        Person Gregor = new Person("Gregor", "Redelonghi", "1968-02-22", "2202968500812", "78402069", this.gregor_PL, this.gregor_PL_do, "035178605");
        Person Tadeja = new Person("Tadeja", "Mali Redelonghi", "1970-01-19", "1901970505327", "43936954", this.tadeja_PL, this.tadeja_PL_do, "035718997");
        Person Zala = new Person("Zala", "Redelonghi", "1996-05-07", "0705996505255", "86319515", this.zala_PL, this.zala_PL_do, "043182009");
        Person Mark = new Person("Mark", "Redelonghi", "1999-04-17", "1704999500073", "24626180", this.mark_PL, this.mark_PL_do, "044752609");
        Person Spela = new Person("Spela", "Redelonghi", "2008-02-11", "1102008505293", "51275317", this.spela_PL, this.spela_PL_do, "048275498");

        // Add members objects to ArrayList lmembers
        // List<Person> lmembers = new ArrayList<Person>();
        this.lmembers.add(Gregor);
        this.lmembers.add(Tadeja);
        this.lmembers.add(Zala);
        this.lmembers.add(Mark);
        this.lmembers.add(Spela);

    }

    void printPersonInfo(String name) {
        Boolean go = false;
        for (Person myperson : this.lmembers) {
            if (myperson.Ime.toUpperCase().equals(name.toUpperCase())) {
                go = true;
                System.out.printf("%-12s%s\n", "Ime" + ":", myperson.Ime);
                System.out.printf("%-12s%s\n", "Priimek" + ":", myperson.Priimek);
                System.out.printf("%-12s%s\n", "RD" + ":", myperson.RD);
                System.out.printf("%-12s%s\n", "EMSO" + ":", myperson.EMSO);
                System.out.printf("%-12s%s\n", "DS" + ":", myperson.DS);
                System.out.printf("%-12s%s\t(do %s)\n", "PL" + ":", myperson.PL, myperson.PL_do);
                System.out.printf("%-12s%s\n", "ZZZS" + ":", myperson.ZZZS);
                System.out.println("------------------------------------------");
                return;
            }
        }
        if (go == false) {
            System.out.printf("No such name: \"%s\"!%n", name);
        }
    }

    public Person getPersonInfo(String name) {
        for (Person myperson : this.lmembers) {
            if (myperson.Ime.toUpperCase().equals(name.toUpperCase())) {
                return myperson;
            }
        }
        return null;
    }

} // end class
