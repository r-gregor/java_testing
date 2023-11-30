import java.util.*;

class Pdtkd {
    
    // STATIC FIELDS AND METHODS
    static String[] header = {"Ime", "Priimek", "RD", "EMSO", "DS", "PL", "PL_do", "ZZZS"};
    
    static String[] dGregor = {"Gregor", "Redelonghi", "1968-02-22", "2202968500812", "78402069", "PB0572199", "2022-03-22", "035178605"};
    static String[] dTadeja = {"Tadeja", "Mali Redelonghi", "1970-01-19", "1901970505327", "43936954", "PB0572172", "2022-03-22", "035718997"};
    static String[] dZala = {"Zala", "Redelonghi", "1996-05-07", "0705996505255", "86319515", "PB0572195", "2017-03-22", "043182009"};
    static String[] dMark = {"Mark", "Redelonghi", "1999-04-17", "1704999500073", "24626180", "PB0898323", "2019-04-08", "044752609"};
    static String[] dSpela = {"Spela", "Redelonghi", "2008-02-11", "1102008505293", "51275317", "PB0491825", "2016-04-07", "048275498"};

    static HashMap<String, String> mGregor = new HashMap<String, String>();
    static HashMap<String, String> mTadeja = new HashMap<String, String>();
    static HashMap<String, String> mZala = new HashMap<String, String>();
    static HashMap<String, String> mMark = new HashMap<String, String>();
    static HashMap<String, String> mSpela = new HashMap<String, String>();
            
    static List<HashMap<String, String>> maps = Arrays.asList(mGregor, mTadeja, mZala, mMark, mSpela);


    /** populateMap
        populate map od each person with data from data list
        parameters: map of person, data list, header list

    */
    public static void populateMap(HashMap<String, String> map, String[] data) {
        for (int i = 0; i < data.length; i++) {
            map.put(header[i], data[i]);
        }
    }
    
    
    /** printMap
        print data of elemnt (person) in map in columns (formated)
        parameters: map of persons
    */
    
    
    /*
    // UNORDERED !!
    public static void printMap(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            // System.out.println(entry.getKey()+" : "+entry.getValue());
            System.out.printf("%-12s%s\n", entry.getKey() + ":", entry.getValue());
        } // end for
        System.out.println("----------------------------------------------------------");
    }
    */
    
    public static void printMap(HashMap<String, String> map) {
        System.out.printf("%-12s%s\n", "Ime" + ":", map.get("Ime"));
        System.out.printf("%-12s%s\n", "Priimek" + ":", map.get("Priimek"));
        System.out.printf("%-12s%s\n", "RD" + ":", map.get("RD"));
        System.out.printf("%-12s%s\n", "EMSO" + ":", map.get("EMSO"));
        System.out.printf("%-12s%s\n", "DS" + ":", map.get("DS"));
        System.out.printf("%-12s%s\t(do %s)\n", "PL" + ":", map.get("PL"), map.get("PL_do"));
        System.out.printf("%-12s%s\n", "ZZZS" + ":", map.get("ZZZS"));
        System.out.println("------------------------------------------");
    }
    
    /** print_header
        print header elements in formated line
    */
    public static void print_header() {
        System.out.printf("%-12s%-20s%-12s%-17s%-10s%-11s%-12s%-11s\n", header[0],
                                                                        header[1],
                                                                        header[2],
                                                                        header[3],
                                                                        header[4],
                                                                        header[5],
                                                                        header[6],
                                                                        header[7]);
    }
    
    /** print_ALL
    print header elements in formated line
    */
    public static void print_ALL() {
        for (HashMap<String, String> map : maps) {
            System.out.printf("%-12s%-20s%-12s%-17s%-10s%-11s%-12s%-11s\n", map.get("Ime"),
                                                                            map.get("Priimek"),
                                                                            map.get("RD"),
                                                                            map.get("EMSO"),
                                                                            map.get("DS"),
                                                                            map.get("PL"),
                                                                            map.get("PL_do"),
                                                                            map.get("ZZZS"));
        }
    }
    
    /** print_person
        prints person data in formated column given the person name
        to printout data use function printMap
    */
    public static void print_person(String name) {
        HashMap<String, String> mymap = new HashMap<String, String>();
        mymap = check_name(name);
        if (mymap != null) {
            printMap(mymap);
        }
        
    } // END print_person
   
    
    public static HashMap<String, String> check_name(String name) {
        for (HashMap<String, String> mymap : maps) {
            if (mymap.get("Ime").toUpperCase().equals(name.toUpperCase())) {
                return mymap;
            }
        } //END for
        
        System.out.printf("No such person: %s!%n", name);
        return null;
    }

    
    // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN // MAIN 
    public static void main(String[] args) {

        // populate persons maps ...
        populateMap(mGregor, dGregor);
        populateMap(mTadeja, dTadeja);
        populateMap(mZala, dZala);
        populateMap(mMark, dMark);
        populateMap(mSpela, dSpela);
        
        // run main:
        String name = null;

        if (args.length == 0) {
            System.out.println("Something went wrong!");
            System.out.println("You have to supply a SINGLE name or all/ALL as parameter.");
            System.exit(0);
            
        } else if (args.length > 1) {
            System.out.println("Something went wrong!");
            System.out.println("You have to supply a SINGLE name or all/ALL as parameter.");
            System.exit(0);
        } else {
            name = args[0];
        }

        System.out.println();
        // if name == ALL --> print all
        if (name.toUpperCase().equals("ALL")) {
            print_header();
            print_ALL();

        } else {
            print_person(name);
        }

 
    } // END main

} // END class
