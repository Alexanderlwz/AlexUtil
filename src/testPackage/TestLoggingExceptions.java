package testPackage;

import local.util.io.LoggingException;

public class TestLoggingExceptions {
	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught " + e);
		}
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.out.println("Caught " + e);
		}
	}
}
