package org.rgregor.mainapp;

import com.example.app1.App1;
import com.example.app2.App2;

public class Mainapp {
    public static void main(String[] args) {

        //App1
        App1 a1 = new App1();
        a1.info();
        double original = 100.0;
        double dn = a1.makeTwiceAsBig(original);
        System.out.printf("Original %f --> double: %f%n", original, dn);

        //App2
        App2 a2 = new App2();
        a2.info2();
        int starnum = 10;
        int squared = a2.squareTheNumber(starnum);
        System.out.printf("Original %d --> squared: %d%n", starnum, squared);

    }

}