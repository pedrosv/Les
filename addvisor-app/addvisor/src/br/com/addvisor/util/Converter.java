package br.com.addvisor.util;

import java.io.StringReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import br.com.addvisor.controller.UserController;
import br.com.addvisor.model.City;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.State;
import br.com.addvisor.model.User;

public class Converter {
	private static Gson gson = new Gson();

	public static UserController getUserController(String json) {
		JsonReader reader = new JsonReader(new StringReader(json));
		reader.setLenient(true);
		return gson.fromJson(reader, UserController.class);
	}

	public static User getUserInstance(String json) {
		JsonReader reader = new JsonReader(new StringReader(json));
		reader.setLenient(true);
		return gson.fromJson(reader, User.class);
	}

	public static Service getServiceInstance(String json) {
		JsonReader reader = new JsonReader(new StringReader(json));
		reader.setLenient(true);
		return gson.fromJson(reader, Service.class);
	}

	public static State getStateInstance(String json) {
		JsonReader reader = new JsonReader(new StringReader(json));
		reader.setLenient(true);
		return gson.fromJson(reader, State.class);
	}

	public static City getCityInstance(String json) {
		JsonReader reader = new JsonReader(new StringReader(json));
		reader.setLenient(true);
		return gson.fromJson(reader, City.class);
	}
}
