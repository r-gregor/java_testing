public class Test {
    public static void main(String[] args) {
        GetDateAsString_V3 dt = new GetDateAsString_V3();
        String my_DT = dt.getDateTimeAsString();
        String my_D = dt.getDateAsString();
        
        System.out.println("Long date: " + my_DT);
        System.out.println("Short date: " + my_D);
    }
}