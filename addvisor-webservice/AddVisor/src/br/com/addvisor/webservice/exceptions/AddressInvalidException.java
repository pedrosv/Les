package br.com.addvisor.webservice.exceptions;

public class AddressInvalidException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public AddressInvalidException(String message){
		super(message);
	}
}
