
public class Strings_20180901 {

	public static void printInt(int N) {
		System.out.println(N);
	}

	public static void printStr(String S) {
		System.out.println(S);
	}

	public static void main(String[] args) {
		String S 	= "Gregor Redelonghi";
		String S2 	= "Valvasorjeva ulica 5, 1000 Ljubljana";
		String S3	= "0123456789";

		System.out.println("S = " + S);

		String SS = S.substring(1, 5);
		System.out.println("Substring SS = " + SS);

		String ales = S + " " + S2 + " \n" + S3;
		System.out.println(ales);

		int N = Integer.parseInt(S3);
		printInt(N);
		int N2 = N / 32456;
		printInt(N2);

		Integer N3 = new Integer(N2);
		String N4 = N3.toString();
		printStr(N4 + " is now a String!");

	}

}
