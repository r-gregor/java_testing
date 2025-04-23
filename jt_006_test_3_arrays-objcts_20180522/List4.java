public class List4
{
   
    // function
    public static String s_end(int fc) {
        String nend;
        
        if (fc == 1) {
            nend = "-st";
            return nend;
        }
        else if (fc == 2) {
            nend = "-nd";
            return nend;
        }
        else if (fc == 3) {
            nend = "-rd";
            return nend;
        }
        else {
            nend = "-th";
            return nend;
        }
    }

    //MAIN
    public static void main(String[] args)
    {   
        int[] st = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] nm = {"Gregor", "Tadeja", "Spelca"};
        int fct = 2;
        int z;
        
        if (fct == 0) {
        z = 1;
        }
        else {
        z = fct - 1; 
        }
        
        System.out.println(fct + s_end(fct) + " member of nums list is: " + st[z]);
        System.out.println(fct + s_end(fct) + " member of names list is: " + nm[z]);

        System.out.println();
        System.out.println("The members of list nums --");
        for (int j = 0; j < st.length; j++)
        {
           z = j + 1;
           System.out.println("The " + z + s_end(z) + " member is: " + st[j]);

        }

        System.out.println();
        System.out.println("The members of list names --");
        for (int k = 0; k < nm.length; k++)
        {
            z = k + 1;
            System.out.println("The " + z + s_end(z) + " member is: " + nm[k]);
        }
             
    } // END MAIN
} // END class
