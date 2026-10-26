public class TryTest {

	public static void main(String[] arguments) throws Exception {
		// declare our resource in try
		try (MyResource resource = new MyResource()) {
			resource.doSomething();
		}
		catch (Exception e) {
			System.out.println("Regular exception: " + e.toString());

			// getting the array of suppressed exceptions, and its length
			Throwable[] suppressedExceptions = e.getSuppressed();
			int n = suppressedExceptions.length;

			if (n > 0) {
				System.out.println("We've found " + n + " suppressed exceptions:");
				for (Throwable exception : suppressedExceptions) {
					System.out.println(exception.toString());
				}
			}
		}
	}
}

