package bankovcikovanci;

import java.util.*;

public class BankovciInKovanci {
    private Map<String, Integer> bc = new LinkedHashMap<String, Integer>();


    {   // initialization block
        /**
         * LinkedHashMap -- preserves the order of insertions!!
         * initialize all values to 0
         */
        bc.put("Bankovec 500 EUR", 0);
        bc.put("Bankovec 200 EUR", 0);
        bc.put("Bankovec 100 EUR", 0);
        bc.put("Bankovec 50 EUR", 0);
        bc.put("Bankovec 20 EUR", 0);
        bc.put("Bankovec 10 EUR", 0);
        bc.put("Bankovec 5 EUR", 0);
        bc.put("Kovanec 2 EUR", 0);
        bc.put("Kovanec 1 EUR", 0);
        bc.put("Kovanec 50 centov", 0);
        bc.put("Kovanec 20 centov", 0);
        bc.put("Kovanec 10 centov", 0);
        bc.put("Kovanec 5 centov", 0);
        bc.put("Kovanec 2 centa", 0);
        bc.put("Kovanec 1 cent", 0);
    }

    /** main method */
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("No parameters!");
            System.out.printf("Usage: %s [amounts in EUR separated with space]%n", "BankovciInKovanci");
            System.exit(1);
        }
   

        /* Get strings of EUR-os
         * replace comma (',') with dot ('.')
         * convert from EURs to CENTS (multiply by 100 and round to 0 decimals)
         * add them to eurs ArrayList 
         */
        List<Double> eurs = new ArrayList<Double>();
        for (String euro: args) {
            Double newEuro = Double.valueOf(euro.replace(",", "."));
            Double centi = (double) Math.round(newEuro * 100);
            eurs.add(centi);
        }

        /* Initialize object and run method getBaknkovciInKovanci()
         * for each element in eurs ArrayList
         */
        BankovciInKovanci BC = new BankovciInKovanci();

        for (Double znesek: eurs) {
            BC.getBaknkovciInKovanci(znesek);
        }
        
    } // end main


    /**
     * Calculate and print the amount of bills and coins for the amount (znesek) in EUR.
     * Puts an amount for each key from LinkedHashMap that represents a bill or a coin, which
     * is a result of integer division with the amount in cents. The rest is carried
     * on to the next lower amount, till it reaches the end (1 cent).
     * Print only those amounts that are != 0
     * @param znesek
     */
    public void getBaknkovciInKovanci(Double znesek) {
        System.out.println("===================================");
        System.out.printf("*** Znesek: %.2f EUR ***%n", znesek/100);

        // calculate and update the LinkedHashMap
        double rest = 0;

        bc.put("Bankovec 500 EUR", (int) (znesek / 50000));
        rest = (znesek % 50000);
        
        bc.put("Bankovec 200 EUR", (int) (rest / 20000));
        rest = (rest % 20000);
        
        bc.put("Bankovec 100 EUR", (int) (rest / 10000));
        rest = (rest % 10000);

        bc.put("Bankovec 50 EUR", (int) (rest / 5000));
        rest = (rest % 5000);

        this.bc.put("Bankovec 20 EUR", (int) (rest / 2000));
        rest = (rest % 2000);

        this.bc.put("Bankovec 10 EUR", (int) (rest / 1000));
        rest = (rest % 1000);

        this.bc.put("Bankovec 5 EUR", (int) (rest / 500));
        rest = (rest % 500);

        this.bc.put("Kovanec 2 EUR", (int) (rest / 200));
        rest = (rest % 200);

        this.bc.put("Kovanec 1 EUR", (int) (rest / 100));
        rest = (rest % 100);

        this.bc.put("Kovanec 50 centov", (int) (rest / 50));
        rest = (rest % 50);
 
        this.bc.put("Kovanec 20 centov", (int) (rest / 20));
        rest = (rest % 20);
 
        this.bc.put("Kovanec 10 centov", (int) (rest / 10));
        rest = (rest % 10);
  
        this.bc.put("Kovanec 5 centov", (int) (rest  / 5));
        rest = (rest % 5);

        this.bc.put("Kovanec 2 centa", (int) (rest / 2));
        rest = (rest % 2);

        this.bc.put("Kovanec 1 cent", (int) (rest / 1));

        // printout
        for(Map.Entry<String, Integer> entry: bc.entrySet()) {
            if (entry.getValue() != 0) {
                System.out.printf("%s = %dx%n",entry.getKey(), entry.getValue());
            }
        }

    }

} // end class