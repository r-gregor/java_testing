// filename Main2.java
package org.mainpackage;

import org.packagename1.*;
import org.packagename2.*;
import com.somecompany.*;

public class Main2 {
    public static void main(String[] args) {
        App1 app1 = new App1();
        app1.DisplayMessage();

        App2 app2 = new App2();
        App2.DisplayMessage();

        App3 app3 = new App3();
        App3.DisplayMessage();

        App4 app4 = new App4();
        app4.DisplayMessage();

        External2 ext2 = new External2();
        ext2.info();

    } // end main
} // end class
