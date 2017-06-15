package br.com.addvisor.util;



import java.io.IOException;
import java.util.List;
import java.util.Locale;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Bundle;
import android.util.Log;

public class GeoLocationManager implements LocationListener {

	private Context mContext;
	private LocationManager locationManager;
	private String address;
	private double latitude;
	private double longitude;
	private double altitude;
	private float accurancy;
	private long time;
	private boolean hasAddress = false;
	private boolean hasCoordinate = false;
	private static final String TAG = "GPS_LOCATION";

	public GeoLocationManager(Context context) {
		this.mContext = context;
		this.locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
		onResume();
	}

	public String getAddress() {
		return address;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public boolean hasAddress() {
		return hasAddress;
	}

	public boolean hasCoordinate() {
		return hasCoordinate;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public float getAccurancy() {
		return accurancy;
	}

	public void setAccurancy(float accurancy) {
		this.accurancy = accurancy;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public boolean GPSisEnable() {
		return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
	}

	private void onResume() {
		Log.d(TAG, "GPS:onResume");
		if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
			locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
			Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

			if (location != null) {
				latitude = location.getLatitude();
				longitude = location.getLongitude();
				address = getAddressName(location.getLatitude(), location.getLongitude());
				hasCoordinate = true;
			}
		}
	}

	public void onPause() {
		Log.d(TAG, "GPS:onPause");
		if (locationManager != null) {
			locationManager.removeUpdates(this);
			locationManager = null;
		}
	}

	@Override
	public void onLocationChanged(Location location) {
		Log.d(TAG, "GPS:onLocationChanged");
		longitude = location.getLongitude();
		latitude = location.getLatitude();
		altitude = location.getAltitude();
		accurancy = location.getAccuracy();
		time = location.getTime();
		hasCoordinate = true;

		if (address == null || address.equals("")) {
			address = getAddressName(latitude, longitude);
		}

		String s = "Location Changed: longitude[" + longitude + "] \nlatitude[" + latitude + "] \naltitude[" + altitude + "] \naccurancy[" + accurancy + "] \ntime[" + time + "]";
		Log.d(TAG, s);
		onPause();

	}

	@Override
	public void onProviderDisabled(String provider) {
		Log.d(TAG, "GPS:onProviderDisabled");
		Log.d(TAG, "Provider disabled");
	}

	@Override
	public void onProviderEnabled(String provider) {
		Log.d(TAG, "GPS:onProviderEnabled");
		Log.d(TAG, "Provider enabled");
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		Log.d(TAG, "GPS:onStatusChanged");
		switch (status) {
			case LocationProvider.OUT_OF_SERVICE:
				Log.v(TAG, "Status Changed: Out of Service");
				break;
			case LocationProvider.TEMPORARILY_UNAVAILABLE:
				Log.v(TAG, "Status Changed: Temporarily Unavailable");
				break;
			case LocationProvider.AVAILABLE:
				Log.v(TAG, "Status Changed: Available");
				break;
			default:
				Log.v(TAG, "Status Changed: I dont know... throw an Exception");
		}
	}

	private String getAddressName(double latitude, double longitude) {
		Geocoder geoCoder = new Geocoder(mContext, Locale.getDefault());
		StringBuilder builder = new StringBuilder();
		String finalAddress = null;
		
		List<Address> address;
		try {
			address = geoCoder.getFromLocation(latitude, longitude, 1);
			int maxLines = address.get(0).getMaxAddressLineIndex();

			for (int i = 0; i < maxLines; i++) {
				String addressStr = address.get(0).getAddressLine(i);
				builder.append(addressStr);
				builder.append(" ");
			}

			hasAddress = true;
			finalAddress = builder.toString();
			
		} catch (IOException e) {
			hasAddress = false;
			finalAddress = "Não foi possível obter a localização";
		}
		
		return finalAddress;
	}
}