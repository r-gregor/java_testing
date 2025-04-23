import java.util.Scanner;

public class ExampleMin3Number {
    public static void main(final String args[]) {

        System.out.println("enter number which comibnation of sum you want");
        final Scanner input = new Scanner(System.in);
        final int num = input.nextInt();
        for(int i=0;i<=9;i++) {
            int sum=0;
            for(int j=0;j<=9;j++) {
                for(int k=0;k<=9;k++) {
                    sum=i+j+k;
                    if(sum==num) {
                        System.out.print(+i+""+j+""+k+" ");
                    }

                }
            }
        }
        
    input.close();
    System.out.println();    
    }
}
