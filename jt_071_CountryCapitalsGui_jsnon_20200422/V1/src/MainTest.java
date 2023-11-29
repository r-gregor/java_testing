
public class MainTest {

    public static void main(String[] args) {
        Countries3 cMap = new Countries3();
        Country panama = cMap.getCountry("Panama");
        System.out.println(panama);
        System.out.println(cMap.getCountry(args[0]));
    }
}