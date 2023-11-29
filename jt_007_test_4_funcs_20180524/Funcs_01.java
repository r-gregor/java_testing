class Funcs_01 {
    
    String mname;
    String msname;
    int mage;
    String maddr;
    
    Funcs_01() {
        System.out.println("This is default constructor without parameters.");
    }
        
    Funcs_01(String name, String sname, int age, String address) {
        this.mname = name;
        this.msname = sname;
        this.mage = age;
        this.maddr = address;
        System.out.println("This is parameterized constructor");
    }
    
    
    Funcs_01(String krneki, String krneki2) {
        System.out.println(krneki + " " + krneki2); 
    }
    
    public String getName() {
        return mname;
    }
    
    
    public static void main(String[] args) {
        
        Funcs_01 obj1 = new Funcs_01();
        Funcs_01 obj2 = new Funcs_01("Gregor", "Redelonghi", 50, "Valvasorjeva ulica 5, 1000 Ljubljana");
        
        System.out.println("My second name is: " + obj2.msname);
        System.out.println("My name is: " + obj2.getName());
        
        Funcs_01 obj3 = new Funcs_01("Kva je zej?", "A bejz na??");
    }

}