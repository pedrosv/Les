package br.com.addvisor.connection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;

import android.util.Log;
import br.com.addvisor.model.Agenda;
import br.com.addvisor.model.City;
import br.com.addvisor.model.Evaluate;
import br.com.addvisor.model.Service;
import br.com.addvisor.model.User;
import br.com.addvisor.model.enums.ServiceCat;

import com.google.gson.Gson;

public class Connection {

	private static DefaultHttpClient connection = null;
	private static Gson gson = new Gson();
	private final static String FAIL_STATUS_CODE = "642";

	/** WEB */
	private final static String PORT = ":15000";
	private final static String IP = "http://euconfio-webservice.servehttp.com" + PORT;
	private final static String APP = "/Addvisor/";

	/** User */
	private final static String AUTHENTICATE_USER = IP + APP + "user/authenticateUser";
	private final static String ADD_USER = IP + APP + "user/addUser";
	private final static String UPDATE_USER = IP + APP + "user/updateUser";
	private final static String REMOVE_USER = IP + APP + "user/removeUser";
	private final static String UPDATE_PASSWORD = IP + APP + "user/setPassword";

	/** Service */
	private final static String ADD_SERVICE = IP + APP + "service/addService";
	private final static String DELETE_SERVICE = IP + APP + "service/removeService";
	private final static String UPDATE_SERVICE = IP + APP + "service/updateService";
	private final static String SERVICE_BY_PHONE_LIST = IP + APP + "service/searchRecommendServices";
	private final static String SERVICE_BY_CITY = IP + APP + "service/allServicesCity";
	private final static String SERVICE_BY_USER = IP + APP + "service/allServicesToUser";
	private final static String SERVICE_BY_CATEGORY = IP + APP + "service/getByCategory";
	private final static String SERVICE_BY_SEARCH = IP + APP + "service/getByKeyword";

	/** Location */
	private final static String ALL_CITIES = IP + APP + "location/allLocations";

	/** Evaluate */
	private final static String ADD_EVALUATE = IP + APP + "evaluate/addEvaluate";
	private final static String EVALUATE_BY_SERVICE = IP + APP + "evaluate/allEvaluatesToService";

	/** Favorite */
	private final static String SERVICES_BY_FAVORITES = IP + APP + "favorite/allFavorite";
	private final static String ADD_FAVORITE = IP + APP + "favorite/addFavorite";
	private final static String REMOVE_FAVORITE = IP + APP + "favorite/removeFavorite";

	/** Functions */
	public static String[] authenticateUser(User user) {
		try {
			return requestPOST(AUTHENTICATE_USER, gson.toJson(user));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] registerUser(User user) {
		try {
			return requestPOST(ADD_USER, gson.toJson(user));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] removeUser(User user) {
		try {
			return requestPOST(REMOVE_USER + "/" + user.getId(), gson.toJson(user));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] updateUser(User user) {
		try {
			return requestPOST(UPDATE_USER, gson.toJson(user));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] updatePassword(User user, String newPassword) {
		try {// TODO
			return requestPOST(UPDATE_PASSWORD + "/" + user.getId() + "&" + newPassword);
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] registerService(Service service) {
		try {
			return requestPOST(ADD_SERVICE, gson.toJson(service));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] updateService(Service service) {
		try {
			return requestPOST(UPDATE_SERVICE, gson.toJson(service));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] deleteService(Service service) {
		try {
			return requestPOST(DELETE_SERVICE, gson.toJson(service));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] getServiceByCity(City city) {
		try {
			return requestPOST(SERVICE_BY_CITY, gson.toJson(city));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] getServiceBySearch(City city, String searched_words) {
		try {
			return requestPOST(SERVICE_BY_SEARCH + "/" + city.getId(), searched_words);
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] getServiceByContacts(City city, Agenda agenda) {
		try {
			return requestPOST(SERVICE_BY_PHONE_LIST + "/" + city.getId(), gson.toJson(agenda));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] getAllCities() {
		try {
			return requestGET(ALL_CITIES);
		} catch (Exception e) {
			e.printStackTrace();
			return failConnection();
		}
	}

	public static String[] getServiceByUser(User user) {
		try {
			return requestGET(SERVICE_BY_USER + "/" + user.getId());
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] getServiceByCategory(ServiceCat category, City city) {
		try {
			return requestPOST(SERVICE_BY_CATEGORY + "/" + city.getId(), gson.toJson(category));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] addEvaluate(User user, Service service, Evaluate evaluate) {
		try {
			return requestPOST(ADD_EVALUATE + "/" + user.getId() + "&" + service.getId(), gson.toJson(evaluate));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] addFavorite(User user, Service service) {
		try {
			return requestPOST(ADD_FAVORITE + "/" + user.getId(), gson.toJson(service));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] removeFavorite(User user, Service service) {
		try {
			return requestPOST(REMOVE_FAVORITE + "/" + user.getId(), gson.toJson(service));
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] getEvaluatesByService(Service service) {
		try {
			return requestGET(EVALUATE_BY_SERVICE + "/" + service.getId());
		} catch (Exception e) {
			return failConnection();
		}
	}

	public static String[] getAllFavorite(User user) {
		try {
			return requestGET(SERVICES_BY_FAVORITES + "/" + user.getId());
		} catch (Exception e) {
			return failConnection();
		}
	}

	private static String[] failConnection() {
		String[] fail = new String[2];
		fail[0] = null;
		fail[1] = FAIL_STATUS_CODE;
		return fail;
	}

	public synchronized static DefaultHttpClient getInstance() {
		if (connection == null) {
			connection = new DefaultHttpClient();
		}
		return connection;
	}

	private static String[] requestGET(String url) throws ClientProtocolException, IOException {

		String[] result = new String[2];
		InputStream content = null;
		getInstance().getParams().setIntParameter("http.socket.timeout", 30000);
		getInstance().getParams().setIntParameter("http.connection.timeout", 30000);

		HttpResponse response;
		response = getInstance().execute(new HttpGet(url));
		content = response.getEntity().getContent();
		result[1] = String.valueOf(response.getStatusLine().getStatusCode());
		result[0] = convertStreamToString(content);

		Log.i("STATUS CODE RESQUEST", result[1]);
		return result;

	}

	private static String[] requestPOST(String url, String jsonText) throws ClientProtocolException, IOException {

		getInstance().getParams().setIntParameter("http.socket.timeout", 30000);
		getInstance().getParams().setIntParameter("http.connection.timeout", 40000);
		HttpPost httppost = new HttpPost(url);
		StringEntity stringEntity;
		String[] result = new String[2];
		String statusCode = null;

		stringEntity = new StringEntity(jsonText, HTTP.UTF_8);
		httppost.setHeader("Content-type", "application/json; charset=utf-8");
		httppost.setEntity(stringEntity);
		HttpResponse response = getInstance().execute(httppost);
		HttpEntity httpEntity = response.getEntity();

		if (httpEntity != null) {
			InputStream inputStream = httpEntity.getContent();
			result[0] = convertStreamToString(inputStream);

		}

		statusCode = String.valueOf(response.getStatusLine().getStatusCode());
		result[1] = statusCode;
		Log.i("STATUS CODE RESQUEST", statusCode);

		return result;
	}

	private static String[] requestPOST(String url) throws ClientProtocolException, IOException {

		getInstance().getParams().setIntParameter("http.socket.timeout", 30000);
		getInstance().getParams().setIntParameter("http.connection.timeout", 40000);
		HttpPost httppost = new HttpPost(url);
		String[] result = new String[2];
		String statusCode = null;

		httppost.setHeader("Content-type", "application/json; charset=utf-8");
		HttpResponse response = getInstance().execute(httppost);
		HttpEntity httpEntity = response.getEntity();

		if (httpEntity != null) {
			InputStream inputStream = httpEntity.getContent();
			result[0] = convertStreamToString(inputStream);
		}

		statusCode = String.valueOf(response.getStatusLine().getStatusCode());
		result[1] = statusCode;
		Log.i("STATUS CODE RESQUEST", statusCode);

		return result;
	}

	private static String convertStreamToString(java.io.InputStream is) {
		java.util.Scanner s = scanner(is).useDelimiter("\\A");
		return s.hasNext() ? s.next() : "";
	}

	private static Scanner scanner(java.io.InputStream is) {
		return new java.util.Scanner(is, "UTF-8");
	}
}
