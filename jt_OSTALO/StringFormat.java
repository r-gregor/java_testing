public class StringFormat {

	public static void main(String[] args) {
		String myLine = String.format("" +
			"%-20s --> %d%n" +
			"%-20s --> %d\tSOLVED!%n",
			"My value:", 1500,
			"Other value:", 750);
		System.out.println(myLine);

	}
}
