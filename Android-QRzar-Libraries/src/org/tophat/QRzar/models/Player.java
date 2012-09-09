package org.tophat.QRzar.models;

import java.util.Map;

import android.os.Parcel;

public class Player extends org.tophat.android.mapping.Player {

	private Boolean alive = false;
	private String qrcode = "";
	private String respawn_code = "";
	public static String API_URI = "players";
	
	public Player()
	{
		super();
	}
	
	public Player(Map<String, Object> data)
	{
		super(data);
		
		if (data.containsKey("alive"))
			this.setAlive((Boolean)data.get("alive"));
		
		if (data.containsKey("qrcode"))
			this.setQrcode((String) data.get("qrcode"));
	}
	
	// Parcelling part
	public Player(Parcel in){
		super(in);
		
		this.setAlive(Boolean.parseBoolean(in.readString()));
		this.setQrcode(in.readString());
	}
	
	/**
	 * @return the alive
	 */
	public Boolean getAlive() {
		return alive;
	}
	/**
	 * @param alive the alive to set
	 */
	public void setAlive(Boolean alive) {
		this.alive = alive;
		
		this.setAttribute("alive", alive);
	}

	/**
	 * @return the qrcode
	 */
	public String getQrcode() {
		return qrcode;
	}
	/**
	 * @param qrcode the qrcode to set
	 */
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
		
		this.setAttribute("qrcode", qrcode);
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		super.writeToParcel(dest, flags);
		
		dest.writeString(this.getAlive().toString());
		dest.writeString(this.getQrcode());
	}

	/**
	 * @return the respawn_code
	 */
	public String getRespawn_code() {
		return respawn_code;
	}

	/**
	 * @param respawn_code the respawn_code to set
	 */
	public void setRespawn_code(String respawn_code) {
		this.respawn_code = respawn_code;
		
		this.setAttribute("respawn_code", respawn_code);
	}
}
