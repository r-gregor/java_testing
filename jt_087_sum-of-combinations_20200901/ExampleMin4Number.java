import java.util.Scanner;

public class ExampleMin4Number {
    public static void main(final String args[]) {

        System.out.println("enter number which comibnation of sum you want");
        final Scanner input = new Scanner(System.in);
        final int num = input.nextInt();
        int count = 0;
        for(int i=0;i<=4;i++) {
            int sum=0;
            for(int j=0;j<=4;j++) {
                for(int k=0;k<=4;k++) {
                    for(int p=0;p<=4;p++) {
                        sum=i+j+k+p;
                        if(sum==num) {
                            if (count % 4 == 0) {
                                System.out.print("\n");
                                System.out.print(+i+""+j+""+k+""+p+" ");
                                count++;
                            } else {
                                System.out.print(+i+""+j+""+k+""+p+" ");
                                count++;
                            }
                        }
                    }
                }
            }
        }
        
    input.close();
    System.out.println();
    System.out.println("-------------------");
    System.out.printf("Number of combinations of 4 nums that make sum of %d is: %d", num, count);
    System.out.println();    
    }
}
