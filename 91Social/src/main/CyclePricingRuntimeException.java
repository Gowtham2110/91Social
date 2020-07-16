package main;

public class CyclePricingRuntimeException extends RuntimeException {
			
	public CyclePricingRuntimeException() {
		super();
	}
	
	public CyclePricingRuntimeException(String message) {
		super(message);
	}
	
	public CyclePricingRuntimeException(String message, Throwable error) {
		super(message, error);
	}
	
	public CyclePricingRuntimeException(Throwable error) {
		super(error);
	}
}
