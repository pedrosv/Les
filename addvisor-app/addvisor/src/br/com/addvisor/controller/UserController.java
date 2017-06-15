package br.com.addvisor.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;

import br.com.addvisor.model.Agenda;
import br.com.addvisor.model.User;
import br.com.addvisor.util.IOUtilities;
import br.com.addvisor.util.Converter;

public class UserController {

	private static UserController instance;
	private final static String FILE = "user.txt";

	private User user;
	private String filesDir;
	private List<Agenda> contacts;

	private UserController() {
		super();
	}

	public static UserController getInstance() {
		if (instance == null) {
			instance = new UserController();
		}
		return instance;
	}

	public User getUser() {
		return instance.user;
	}

	public void setUser(User user) {
		instance.user = user;
		save();
	}

	public List<Agenda> getContacts() {
		return instance.contacts;
	}

	public void setContacts(List<Agenda> contacts) {
		instance.contacts = contacts;
	}

	public String getFilesDir() {
		return instance.filesDir;
	}

	public void setFilesDir(String filesDir) {
		instance.filesDir = filesDir;
	}

	public boolean fileExists() {
		return new File(getAbsolutePath()).exists();
	}

	public void load() {
		String instanceJSON = IOUtilities.read(getAbsolutePath());
		instance = Converter.getUserController(instanceJSON);
	}

	private String getAbsolutePath() {
		return getFilesDir() + "/" + FILE;
	}

	public void save() {
		Gson gson = new Gson();
		try {
			IOUtilities.write(filesDir, FILE, gson.toJson(instance));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void logout() {
		IOUtilities.logout(filesDir, FILE);
	}

	public void dispose() {
		user = null;
		filesDir = null;
		contacts = null;
		instance.user = null;
		instance.filesDir = null;
		instance.contacts = null;
		instance = null;
	}
}
