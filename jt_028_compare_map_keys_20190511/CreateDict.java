// filename: CreateDict.java

import java.util.*;

class CreateDict {

    public static void createMap(Map<String, String> mymap) {
        mymap.put("prvi", "The First Knight");
        mymap.put("drugi", "The Second Chance");
        mymap.put("tretji", "The Third Wish");
        mymap.put("cetrti", "The fourth Mile");
        mymap.put("peti", "The Fifth Wave");
        mymap.put("sesti", "The Sixth sense");
        mymap.put("sesti", "The Sixth sense");
        mymap.put("sedmi", "The Seventh Dwarf");
        mymap.put("osmi", "The Eighth Line");
        mymap.put("deveti", "The Nineth Level of Hell");
        mymap.put("deseti", "TheTenth Amandement");
    }

    public static void main(String[] argv) {
        Map<String, String> map1 = new HashMap<String, String>();
        createMap(map1);
        String[] keys = {"peti", "deseti", "sesti", "dvanajsti", "tretji"};

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("prvi", "Prvi januar je Novo Leto");
        map2.put("tretji", "Tretji kamen od sonca");
        map2.put("peti", "Peti pa res ne zna");
        map2.put("sedmi", "Sedmi dan");
        map2.put("deveti", "deveti krog");


        // /*
        for (String name : keys) {
            String value = map1.get(name);
            if (value != null) {
                System.out.printf("The elemnet %s: %s%n", name, value);
            } else {
                continue;
            } // end if
        } // end for
        // */

        System.out.println("----------------------------------------------------------------");

        // /*
        for (String name2 : keys) {
            if (map1.containsKey(name2)) {
                String value2 = map1.get(name2);
                System.out.printf("The elemnet %s: %s%n", name2, value2);
            } // end if
        } // end for
        // */

        System.out.println("----------------------------------------------------------------");

        /** set of keys in map2*/
        Set<String> keys3 = map2.keySet();

        for (String name3 : keys3) {
            if (map1.containsKey(name3)) {
                String value3 = map1.get(name3);
                System.out.printf("The elemnet %s: %s%n", name3, value3);
            } // end if
        } // end for

    } // end main

} // end class
