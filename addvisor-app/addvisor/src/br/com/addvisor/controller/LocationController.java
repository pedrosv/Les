package br.com.addvisor.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import br.com.addvisor.model.City;
import br.com.addvisor.model.State;
import br.com.addvisor.model.User;
import br.com.addvisor.util.IOUtilities;
import br.com.addvisor.util.Converter;

import com.google.gson.Gson;

public class LocationController {

	private static final String STATES_FILE = "states.txt";
	private static final String CITY_KEY_JSON = "city";
	private static final String TXT_EXTENSION = ".txt";

	private static String[] FILES = { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN",
			"RO", "RR", "RS", "SC", "SE", "SP", "TO" };

	private static LocationController instance;
	private List<State> statesList;
	private List<City> citiesList;
	private String filesDir;

	private LocationController() {
		super();
		statesList = new ArrayList<State>();
		citiesList = new ArrayList<City>();
	}

	public static LocationController getInstance() {
		if (instance == null) {
			instance = new LocationController();
		}
		return instance;
	}

	public void setFilesDir(String path) {
		instance.filesDir = path;
	}

	public String getFilesDir() {
		return instance.filesDir;
	}

	public boolean filesExists() {

		if (!(new File(getFilesDir(), STATES_FILE)).exists()) {
			return false;
		}

		for (String nameFile : FILES) {
			File file = new File(getFilesDir(), nameFile + TXT_EXTENSION);
			if (!file.exists()) {
				return false;
			}
		}
		return true;
	}

	public List<State> getStatesList() {
		return instance.statesList;
	}

	public List<City> getCitiesList() {
		return instance.citiesList;
	}

	public void load() {
		loadStatesList();
		loadCitiesList();
	}

	private void loadCitiesList() {
		User user = UserController.getInstance().getUser();

		if (user != null) {
			try {
				State state = user.getCity().getState();
				instance.citiesList = getCitiesByState(state.getUf());
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
	}

	private void loadStatesList() {
		File statesFile = new File(getFilesDir(), STATES_FILE);
		if (statesFile.exists()) {
			try {
				String jsonArray = IOUtilities.read(statesFile.getAbsolutePath());
				JSONArray array = new JSONArray(jsonArray);

				for (int i = 0; i < array.length(); i++) {
					JSONObject json = array.getJSONObject(i);
					State state = Converter.getStateInstance(json.toString());
					instance.statesList.add(state);
				}

				Collections.sort(instance.statesList);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
	}

	public List<City> getCitiesByState(String UF) throws JSONException {
		citiesList.clear();
		File file = new File(getFilesDir(), UF + TXT_EXTENSION);

		if (!file.exists()) {
			return citiesList;
		}

		String jsonArray = IOUtilities.read(file.getAbsolutePath());
		JSONArray array = new JSONArray(jsonArray);

		for (int i = 0; i < array.length(); i++) {
			JSONObject json = array.getJSONObject(i);
			City city = Converter.getCityInstance(json.toString());
			citiesList.add(city);
		}

		Collections.sort(citiesList);
		return citiesList;
	}

	public void saveCities(String cities) throws JSONException, IOException {
		HashMap<State, List<City>> mapCities = new HashMap<State, List<City>>();
		JSONObject json = new JSONObject(cities);
		JSONArray array = json.getJSONArray(CITY_KEY_JSON);

		for (int i = 0; i < array.length(); i++) {
			JSONObject jsonCity = array.getJSONObject(i);

			City city = Converter.getCityInstance(jsonCity.toString());
			State state = city.getState();

			if (mapCities.containsKey(state)) {
				mapCities.get(state).add(city);
			} else {
				List<City> listCities = new ArrayList<City>();
				listCities.add(city);
				mapCities.put(state, listCities);
			}
		}

		createFiles(mapCities);
	}

	public String[] getCitiesToArray(State state) {
		List<City> cities = new ArrayList<City>();
		try {
			cities = getCitiesByState(state.getUf());
		} catch (JSONException e) {
			e.printStackTrace();
		}

		String[] array = new String[cities.size()];

		for (int i = 0; i < cities.size(); i++) {
			array[i] = cities.get(i).getName();
		}

		return array;
	}

	public String[] getStatesArray() {
		String[] array = new String[statesList.size()];

		for (int i = 0; i < statesList.size(); i++) {
			array[i] = statesList.get(i).getUf();
		}

		return array;
	}

	private void createFiles(HashMap<State, List<City>> mapCities) throws IOException {
		Gson gson = new Gson();
		File stateFile = new File(getFilesDir(), STATES_FILE);
		String jsonListStates = gson.toJson(mapCities.keySet());

		FileOutputStream outState = new FileOutputStream(stateFile, true);
		outState.write(jsonListStates.getBytes());
		outState.flush();
		outState.close();

		for (State state : mapCities.keySet()) {
			File file = new File(getFilesDir(), state.getUf() + TXT_EXTENSION);
			String jsonListCities = gson.toJson(mapCities.get(state));

			FileOutputStream out = new FileOutputStream(file, true);
			out.write(jsonListCities.getBytes());
			out.flush();
			out.close();
		}
	}

	public void dispose() {
		statesList = null;
		citiesList = null;
		filesDir = null;
		instance.statesList = null;
		instance.citiesList = null;
		instance.filesDir = null;
		instance = null;
	}
}
