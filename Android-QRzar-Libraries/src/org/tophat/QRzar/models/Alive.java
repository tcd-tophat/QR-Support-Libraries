package org.tophat.QRzar.models;

import java.util.Map;

import android.os.Parcel;

public class Alive extends Player {

	public static String API_URI = "alive";
	
	public Alive()
	{
		super();
		this.setAccessUrl(API_URI);
	}
	
	public Alive(Map<String, Object> data)
	{
		super(data);
		this.setAccessUrl(API_URI);
	}
}
