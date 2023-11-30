import java.util.ArrayList;

class arrList1 {
    
    public static void main(String[] args){
        ArrayList<String> imena = new ArrayList<String>();
        String[] nms = {"Gregor", "Tadeja", "Zala", "Mark", "Spela"};
        for (int i=0; i < nms.length; i++) {
            imena.add(nms[i]);
        }
        
        System.out.println("The contents of arrList imena: " + imena);
    }
}
