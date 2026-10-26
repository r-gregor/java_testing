import java.util.*;

public class TestEquality {

    static Map<String, Person> pmap;

    /**
     * Tests equality between two members<Person> in pmap
     * @param pmap
     * @param p1
     * @param p2
     */
    public static void testEquality(String p1, String p2) {
        System.out.printf("%s(%s) and %s(%s) are equal? %b%n", pmap.get(p1).getName(), p1, pmap.get(p2).getName(), p2,  pmap.get(p1).equals(pmap.get(p2)));
    }

    /**
     * Display a name and hashcode for each member<Pearson> in pmap
     * @param pmap
     */
    public static void displayHashCodes() {
        pmap.forEach((key, name) -> System.out.printf("%15s%d%n", name.getName() + "(" +key+ "):  ", name.getHashcode()));
        System.out.println("--------------------------------------------");
        pmap.values().forEach(name -> System.out.printf("%15s%d%n", name.getName() + ":  ", name.getHashcode()));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        pmap = new HashMap<>();
        pmap.put("G1", new Person("Gregor", 52));
        pmap.put("T1", new Person("Tadeja", 50));
        pmap.put("G2", new Person("Gregor", 52));

        Person G3 = pmap.get("G1");
        pmap.put("G3", G3);

        pmap.put("T2", (Person)pmap.get("T1").clone());

        testEquality("G1", "G2");
        testEquality("G1", "G3");
        testEquality("T1", "T2");

        System.out.println();
        System.out.printf("%15s%s%n", "Person:  ", "hashcode");
        displayHashCodes();
    }
}

