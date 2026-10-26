import java.util.Scanner;

public class ExampleMin4Number {

public static void crtice(int columns) {
	for (int i = 0; i < ((columns * 4) + columns - 1); i++) {
		System.out.print("-");
	}
    System.out.println();
}

    public static void main(final String args[]) {
	    final int columns = 10;
		final int num;

		if (args.length == 1) {
			num = Integer.parseInt(args[0]);
		} else {
			System.out.println("enter number which comibnation of sum you want");
        	final Scanner input = new Scanner(System.in);
        	num = input.nextInt();
			input.close();
		}

        int count = 0;
        for(int i=0;i<=9;i++) {
            int sum=0;
            for(int j=0;j<=9;j++) {
                for(int k=0;k<=9;k++) {
                    for(int p=0;p<=9;p++) {
                        sum=i+j+k+p;
                        if(sum==num) {
                            if (count % columns == 0) {
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
        
    System.out.println();
	
	crtice(columns);
    System.out.printf("Number of combinations of 4 nums that make sum of %d is: %d", num, count);
    System.out.println();    
    }
}

