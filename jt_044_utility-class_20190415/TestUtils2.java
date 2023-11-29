// filename TestUtils2.java

public class TestUtils2 {
    /** Main method */
    public static void main(String[] args) {
        Utils2.cls();

        Utils2.start_info();
        Utils2.tprint("");

        Utils2.tprint("Thi is NOT valid ...");

        Utils2.crta(80, "-");
        Utils2.tprint(Utils2.crta_st(45, ":"));
        Utils2.crta_tp(45, "o");

        String[] list = new String[5];
        list[0] = "First line ...";
        list[1] = "Second line ...";
        list[2] = "Third line ...";
        list[3] = "Fourth line ...";
        list[4] = "Fifth line ...";

        for (int i = 0; i < list.length; i++) {
            Utils2.tprint(list[i]);
        }

        Utils2.crta_tp(45, "=");
        for (int i = 8; i < 81; i +=8) {
            Utils2.tprint("" + i);

        }








    }
}
