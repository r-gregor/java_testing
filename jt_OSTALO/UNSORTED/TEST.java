public class TEST {

	public static void main(String[] args) {
		double actual = 0.0;
		double target = 100.0;
		 
		for ( int step=0; step<500; step++ ) {
			actual = (15*actual + target)/16;
			System.out.println(actual);
		}
	}
}
