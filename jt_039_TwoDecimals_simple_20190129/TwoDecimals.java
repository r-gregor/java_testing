import java.util.*;

public class TwoDecimals {
    public static void main(String[] args) {
        
        ArrayList<Double> AL = new ArrayList<Double>();
        AL.add(197.55);
        AL.add(1905.54889);
        AL.add(15.893);
        AL.add(15.897);
        AL.add(15.050);
        AL.add(19005.8);
        AL.add(15000D);
        
        System.out.println(AL);

        System.out.println();
        for (Double num : AL) {
            System.out.println("Reducing decimals after decimal point of " + num +" to two decimals: " + (int)(num * 100) / 100.0);
        }
    }

}