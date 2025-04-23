// Person.java

class Person {
    
    // "Ime", "Priimek", "RD", "EMSO", "DS", "PL", "PL_do", "ZZZS"
    public String Ime;
    public String Priimek;
    public String RD;
    public String EMSO;
    public String DS;
    public String PL;
    public String PL_do;
    public String ZZZS;
    
    // default constructor
    Person() {
        System.out.println("-- Default constructor --");
    }
    
    // parameterized constructor
    Person(String Ime, String Priimek, String RD, String EMSO, String DS, String PL, String PL_do, String ZZZS) {
        this.Ime = Ime;
        this.Priimek = Priimek;
        this.RD = RD;
        this.EMSO = EMSO;
        this.DS = DS;
        this.PL = PL;
        this.PL_do = PL_do;
        this.ZZZS = ZZZS;
    }
    
    void print_person_info() {
        System.out.printf("%-12s%s\n", "Ime" + ":", this.Ime);
        System.out.printf("%-12s%s\n", "Priimek" + ":", this.Priimek);
        System.out.printf("%-12s%s\n", "RD" + ":", this.RD);
        System.out.printf("%-12s%s\n", "EMSO" + ":", this.EMSO);
        System.out.printf("%-12s%s\n", "DS" + ":", this.DS);
        System.out.printf("%-12s%s\t(do %s)\n", "PL" + ":", this.PL = PL, this.PL_do);
        System.out.printf("%-12s%s\n", "ZZZS" + ":", this.ZZZS);
        System.out.println("------------------------------------------");
    }
    
    void print_person_inline() {
        System.out.printf("%-12s%-20s%-12s%-17s%-10s%-11s%-12s%-11s\n", this.Ime,
                                                                        this.Priimek,
                                                                        this.RD,
                                                                        this.EMSO,
                                                                        this.DS,
                                                                        this.PL,
                                                                        this.PL_do,
                                                                        this.ZZZS);
    }    
    
    
    void set_PL(String nov_PL, String nov_PL_do) {
        this.PL = nov_PL;
        this.PL_do = nov_PL_do;
    }

} // end class