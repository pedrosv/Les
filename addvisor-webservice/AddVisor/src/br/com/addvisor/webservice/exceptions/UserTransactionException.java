package br.com.addvisor.webservice.exceptions;

public class UserTransactionException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public UserTransactionException(String message){
		super(message);
	}
	
}
