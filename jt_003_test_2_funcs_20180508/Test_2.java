public class Test_2
{

    // instance variables
    String name;
    String surname;
    String address;
    String town;
    int post_code;
    int age;
    

    //constructor
    public Test_2(String name, String surname, String address, String town, int post_code, int age)
    {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.town = town;
        this.post_code = post_code;
        this.age = age;
    }

    
    public String getName()
    {
        return name;    
    }
    
    public String getSurname()
    {
        return surname;    
    }
    
    public String getAddress()
    {
        return address;    
    }
    
    public String getTown()
    {
        return town;    
    }
    
    public int getPC()
    {
        return post_code;    
    }
    
    public int getAge()
    {
        return age;    
    }
    

    public static void main(String[] args)
    {
        Test_2 fotr = new Test_2("Gregor", "Redelonghi", "Valvasorjeva ulica 5", "Ljubljana", 1000, 50);
        
        System.out.println("My name is: " + fotr.getName());
        System.out.println("My surname is: " + fotr.getSurname());
        System.out.println("I live at addres: " + fotr.getAddress());
        System.out.println("I live in: " + fotr.getPC() + ", " + fotr.getTown());
        System.out.println("I am " + fotr.getAge() + " years old.");
    }
    
    
}