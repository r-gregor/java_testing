public class TimeStamp_V3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("%s -- Starting ...\n", TMS.tms());
        
        for (int n = 1; n < 11; n++) {
            System.out.println("This is action number " + n);
            Thread.sleep(500);
        }
        System.out.printf("%s -- Ending ...\n", TMS.tms());
        
        
        System.out.println();
        System.out.println("Test-1:");
        System.out.println("GetDateAsString_V3.getDateTimeAsString() ==> " + GetDateAsString_V3.getDateTimeAsString());
        Thread.sleep(1000);
        System.out.println("GetDateAsString_V3.getDateAsString() ==> " + GetDateAsString_V3.getDateAsString() );
        Thread.sleep(1000);
        System.out.println("GetDateAsString_V3.tms() ==> " + GetDateAsString_V3.tms());
        
        
        System.out.println();
        System.out.println("Test-2:");
        for (int n = 1; n < 6; n++) {
            System.out.println("GetDateAsString_V3.getDateTimeAsString()-" + n + " ==> " + GetDateAsString_V3.getDateTimeAsString());
            Thread.sleep(1000);
        }
    }
}