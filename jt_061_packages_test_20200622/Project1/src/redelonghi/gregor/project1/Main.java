package redelonghi.gregor.project1;

import redelonghi.gregor.project2.*;

public class Main {
    public static void main(String[] args) {
        Test tt = new Test("Gregor Redelonghi", 52);
        Info in = new Info();

        // Does NOT compile due to the "private" constructor in Test class
        // Test t2 = new Test();

        System.out.printf("Name: %s%nage: %d%n", tt.getName(), tt.getAge());
        System.out.printf("Info: %s%n", in.getInfo());

        // public static factory method:
        Test nt = Test.creatATestInstance("Mark", 23);
        System.out.printf("Name: %s%nage: %d%n", nt.getName(), nt.getAge());
    }
}
