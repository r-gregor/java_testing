
public class StringBuilderTest {
    public static void main(String[] args) {
        boolean isit = false;
        long lnum = 1234567898765432122L;
        StringBuilder line = new StringBuilder();
        line.append(1200);
        line.append(" -- What a Wreck! \"ČČČŠŠŠŽŽŽčččćććšššđđđžžž\" -- ");
        line.append(24.45);
        line.append(" ");
        line.append(isit);
        line.append(" ");
        line.append(lnum);

        System.out.println(line);

        // better ...
        String line2 = new StringBuilder()
            .append(2100).append(" just some text \"ČČČŠŠŠŽŽŽčččćććšššđđđžžž\" ")
            .append(45.24 + " ").append(isit)
            .append(" ")
            .append(998877665544332211L)
            .append(" " + (String.format("%.0f", Math.pow(2, 30)-1)) + " | END!")
            .toString();

        System.out.println(line2);
    }
}
