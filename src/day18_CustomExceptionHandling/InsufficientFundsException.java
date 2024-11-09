package day18_CustomExceptionHandling;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}

}
