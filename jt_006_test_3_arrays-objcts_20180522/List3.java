public class List3
{
    public static void main(String[] args)
    {
        int[] st = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] nm = {"Gregor", "Tadeja", "Spelca"};
        int fct = 2;
        String nend;
        
        if (fct == 1) {
            nend = "-st";
        }
        else if (fct == 2) {
            nend = "-nd";
        }
        else if (fct == 3) {
            nend = "-rd";
        }
        else {
            nend = "-th";
        }
        
        System.out.println(fct + nend + " member of nums list is: " + st[2]);
        System.out.println(fct + nend + " member of names list is: " + nm[2]);
        
        System.out.println();
        for (int j=0; j < st.length; j++)
        {
            System.out.println("The member number " + j + " is: " + st[j]);
        }

        System.out.println();
        for (int k = 0; k < nm.length; k++)
        {
            System.out.println("The member number " + k + " is: " + nm[k]);
        }
             
    }
}
