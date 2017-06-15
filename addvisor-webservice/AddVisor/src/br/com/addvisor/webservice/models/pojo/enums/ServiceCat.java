package br.com.addvisor.webservice.models.pojo.enums;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Lucas on 01/12/14.
 */
@XmlRootElement
public enum ServiceCat {
	ALIMENTACAO("Alimentação"), ANIMAIS("Animais"), AULAS("Aulas"), AUTOMOTIVO("Automotivo"), BELEZA_E_BEM_ESTAR("Beleza e bem-estar"), CASA_E_CONSTRUCAO(
			"Casa e construção"), COMUNICACAO_E_ARTES("Comunicação e artes"), CONSULTORIA("Consultoria"), DELIVERY("Delivery"), EVENTOS_E_MUSICA(
			"Eventos e Música"), SAUDE("Saúde"), TECNOLOGIA("Tecnologia"), TRANSPORTE("Transporte"), SEGURANCA("Segurança"), OUTROS("Outros");

	private String value;

	ServiceCat(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public static ServiceCat getCategory(String categoryName){
		return valueOf(categoryName); 
	}
}
