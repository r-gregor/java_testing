// filename Main.java
package org.mainpackage;

import org.packagename1.*;
import org.packagename2.*;

public class Main {
    public static void main(String[] args) {
        App1 app1 = new App1();
        app1.DisplayMessage();

        App2 app2 = new App2();
        App2.DisplayMessage();

        App3 app3 = new App3();
        App3.DisplayMessage();

        App4 app4 = new App4();
        app4.DisplayMessage(); 

    } // end main
} // end class
