public class Test_1
{
    String fst_name = "Spela";
    String snd_name = "Redelonghi";
    String hobby = "Dancing and drawing";
    
    
    public String getName()
    {
        return fst_name + " " + snd_name;        
    }
    
    public String getHobbies()
    {
        return hobby;        
    }
    
    public static void main(String[] args)
    {
        Test_1 hci = new Test_1();
        String sntc_1 = "My name is: " + hci.fst_name + ".";
        String sntc_2 = "My surname is: " + hci.snd_name + ".";
        String sntc_3 = "My hobbies are: " + hci.hobby + ".";
        
        System.out.println(sntc_1);
        System.out.println(sntc_2);
        System.out.println(sntc_3);

        
        System.out.println("\nTest 1: using function to get the full name: " + hci.getName());
        System.out.println("Test 2: using function to get the hobbies: " + hci.getHobbies());
   
    }
    
}
