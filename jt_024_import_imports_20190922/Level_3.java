// Level_3.java

public class Level_3 {

    public static void main(String [] args) {
        Level_2 L2 = new Level_2();
        L2.Speak();

        String myl = L2.L1.line;
        System.out.println(myl);

        String myL2 = Level_1.line;
        System.out.println(myL2);

        L2.L1.TellMe();
        L2.L1.Shout();
    }

}
