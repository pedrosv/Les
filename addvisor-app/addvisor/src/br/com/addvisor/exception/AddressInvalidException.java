package br.com.addvisor.exception;

public class AddressInvalidException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public AddressInvalidException(String message){
		super(message);
	}
}
