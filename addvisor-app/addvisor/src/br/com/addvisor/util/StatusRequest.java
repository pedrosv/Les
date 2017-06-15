package br.com.addvisor.util;

public class StatusRequest {
	
	private final static String SUCESS_STATUS_CODE = "200";
	private final static String INVALID_STATUS_CODE = "204";
	private final static String SERVER_FAILED = "642";
	private final static String NULL = "null";
	
	public static boolean sucess(String[] result){
		return result[0] != null && !result[0].equals(NULL) && result[1].equals(SUCESS_STATUS_CODE);
	}
	
	public static boolean failed(String[] result){
		return result[0] == null && result[1].equals(SERVER_FAILED);
	}
	
	public static boolean invalidRequest(String[] result){
		return result[0] == null && result[1].equals(INVALID_STATUS_CODE);
	}
	
	public static boolean noServices(String[] result){
		return (result[0] == null || result[0].equals(NULL)) && result[1].equals(SUCESS_STATUS_CODE);
	}
}
