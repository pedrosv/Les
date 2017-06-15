package br.com.addvisor.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agenda {

	private List<String> names;
	private List<String> numbers;
	private Map<String, String> contacts;

	public Agenda() {
		super();
		names = new ArrayList<String>();
		numbers = new ArrayList<String>();
		contacts = new HashMap<String, String>();
	}

	public void addContact(String name, String number) {
		names.add(name);
		numbers.add(number);
		contacts.put(name, number);
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}

	public Map<String, String> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, String> contacts) {
		this.contacts = contacts;
	}

}
