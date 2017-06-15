package br.com.addvisor.model.enums;

public enum PriceCat {

	MUITO_BARATO("Muito barato"), BARATO("Barato"), JUSTO("Justo"), CARO("Caro"), MUITO_CARO("Muito caro");

	private String value;

	PriceCat(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static PriceCat getPrice(String price) {
		return valueOf(price);
	}

	public static PriceCat[] getPricesList() {
		return PriceCat.values();
	}

	public static String[] getValuesToString() {
		PriceCat[] prices = getPricesList();
		String[] array = new String[prices.length];

		for (int i = 0; i < prices.length; i++) {
			array[i] = prices[i].getValue();
		}
		return array;
	}

}
