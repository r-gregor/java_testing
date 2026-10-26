// Level_1.java

class Level_1 {
    String id = "Level_1";
    String name ="Gregor";
    static String line = "THIS IS A STATIC LINE.";
    static String line2 = "THIS IS A STATIC LINE 2.";

    void TellMe() {
        System.out.printf("This is class %s, and name is: %s%n", this.id, this.name);
    }

    static void Shout() {
        System.out.println(line2);
    }

}
