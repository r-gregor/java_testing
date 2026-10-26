public class MyResource implements AutoCloseable {
	// method throws RuntimeException
	public void doSomething() {
		throw new RuntimeException("From the doSomething method");
	}

	// we'll override close so that it throws an exception in the implicit finally block of try-with-resources
	// (when it attempts to close our resource)
	@Override
	public void close() throws Exception {
		throw new ArithmeticException("I can throw whatever I want, you can't stop me.");
	}
}
