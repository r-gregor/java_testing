// 
public class Printouts {
	static String head_1 = "Miles    ";
	static String head_m =  "|";
	static String head_2 = "      Kilometers";
	static String header = head_1 + head_m + head_2;
		
	static int h_1_len = head_1.length();
	static int h_m_len = head_m.length();
	static int h_2_len = head_2.length();
		
	static int header_length = h_1_len + h_m_len + h_2_len;

	// main
	public static void main(String[] args) {
		
		System.out.println("Test:");
		// System.out.println(header);
		headerp(head_1, head_m, head_2);
		crtc(header_length);
		
		double[] miles = {1, 2, 3, 5, 16, 22, 100};
		double[] kilometers = new double[miles.length];
		
		for (int i = 0; i < miles.length; i++) {
			kilometers[i] = miles[i] * 1.609;
		}
		
		for (int i = 0; i < miles.length; i++) {
			linep(miles[i], kilometers[i]);
		}
		
		
		//linep("Value 1", "Result 1");
		//linep("Value 22", "Result 22");
	} // end main
	
	
	// crtc -------------------------
	public static void crtc(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		} // end for
		System.out.println();
	} // end crtc
	
	
	// headerp
	public static void headerp(String head_1, String head_m, String head_2)	{
		System.out.println(head_1 + head_m + head_2);
	}
	
	// linep
	public static void linep(Double v1, Double v2) {
		String f1 = "%-" + String.valueOf(h_1_len) + ".0f";
		String f2 = "%" + String.valueOf(h_2_len) + ".3f";
		String format  = f1 + head_m + f2 + "%n";
		System.out.printf(format, v1, v2);
	}

} // end class