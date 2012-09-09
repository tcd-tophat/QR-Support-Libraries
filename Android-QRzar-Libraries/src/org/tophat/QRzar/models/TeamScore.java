package org.tophat.QRzar.models;

import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class TeamScore extends org.tophat.android.mapping.Mapping implements Parcelable 
{
	private static String API_URI = "teamscore";
	
	private Integer score;
	
	public TeamScore()
	{
		super();
		this.setAccessUrl(API_URI);
	}
	
	public TeamScore(Map<String, Object> data)
	{
		super(data);
		this.setAccessUrl(API_URI);
		
		if (data.containsKey("score"))
			this.setScore((Integer)data.get("score"));
	}
	
	// Parcelling part
	public TeamScore(Parcel in)
	{
		this.setScore(in.readInt());
	}
	

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(this.getScore());
	}

	/**
	 * @return the score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(Integer score) {
		this.score = score;
		
		this.setAttribute("score", score);
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
}
