public class danes2
{
    public static void main(String[] args)
    {
        DANES nob1 = new DANES();
        String mnm = nob1.my_name;
        String msnm = nob1.my_sname;
        System.out.println("My name is " + mnm + " and my scnd name is " + msnm + ".");
        
        System.out.println("\nPrinting data from class DANES trough object: nob1.printMyData():");
        nob1.printMyData();
        
    }

}