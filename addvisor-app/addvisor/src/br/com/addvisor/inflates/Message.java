package br.com.addvisor.inflates;

import android.content.Context;
import android.widget.Toast;

public class Message {

	private final String NO_INTERNET_CONNECTION = "Sem conexão com a internet";
	private final String SERVER_FAILED = "Desculpe, sem conexão com o servidor";
	private final String FILL_ALL_FIELDS = "Preencha todos os campos corretamente";
	private final String INVALID_AUTHENTICATION = "Telefone/Senha inválidos";
	private final String PHONE_ALREADY_EXISTS = "Telefone já cadastrado";
	private final String NO_SERVICES = "Sem serviços cadastrados";

	private Context context;

	public Message(Context context) {
		this.context = context;
	}

	public void showToast(String text) {
		Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
	}

	public void showNoInternetConnection() {
		Toast.makeText(context, NO_INTERNET_CONNECTION, Toast.LENGTH_SHORT).show();
	}

	public void showServerFail() {
		Toast.makeText(context, SERVER_FAILED, Toast.LENGTH_SHORT).show();
	}

	public void showFillAllFields() {
		Toast.makeText(context, FILL_ALL_FIELDS, Toast.LENGTH_SHORT).show();
	}

	public void showInvalidAuthentication() {
		Toast.makeText(context, INVALID_AUTHENTICATION, Toast.LENGTH_SHORT).show();
	}

	public void showPhoneAlreadyExists() {
		Toast.makeText(context, PHONE_ALREADY_EXISTS, Toast.LENGTH_SHORT).show();
	}
	
	public void showNoServices() {
		Toast.makeText(context, NO_SERVICES, Toast.LENGTH_SHORT).show();
	}
}
