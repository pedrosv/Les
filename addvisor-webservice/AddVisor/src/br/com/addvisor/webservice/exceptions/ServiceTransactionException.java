package br.com.addvisor.webservice.exceptions;

public class ServiceTransactionException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public ServiceTransactionException(String message){
		super(message);
	}
	
}
