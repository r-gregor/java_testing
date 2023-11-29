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

    @Override
    public String toString() {
        return String.format(   "Full name: " + this.Ime + " " + this.Priimek + "\n" +
                                "RD: " + this.RD + "\n" +
                                "EMSO: " + this.EMSO + "\n" +
                                "DS: " + this.DS + "\n" +
                                "PL: " + this.PL + ", velja do: "  + this.PL_do + "\n" +
                                "ZZZS: " + this.ZZZS);
    }

} // end class
