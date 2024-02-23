package com.example.fyp_app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Camera")
public class Camera {
	
	@Id//Marks the primary key of the table.
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Primary key auto-increments.
    private int cameraid;
	
	@Column(name = "customname")
	private String customname;
	
	@Column(name = "camusername")
	private String camusername;
	
	@Column(name = "campassword")
	private String campassword;
	
	@Column(name = "rtspurl")
	private String rtspurl;
	
	@Column(name = "streampath")
	private String streampath;
	
	@Column(name = "userid")
	private int userid;
	

	public int getCameraid() {
		return cameraid;
	}

	public void setCameraid(int cameraid) {
		this.cameraid = cameraid;
	}

	public String getCustomname() {
		return customname;
	}

	public void setCustomname(String customname) {
		this.customname = customname;
	}

	public String getCamusername() {
		return camusername;
	}

	public void setCamusername(String camusername) {
		this.camusername = camusername;
	}

	public String getCampassword() {
		return campassword;
	}

	public void setCampassword(String campassword) {
		this.campassword = campassword;
	}

	public String getRtspurl() {
		return rtspurl;
	}

	public void setRtspurl(String rtspurl) {
		this.rtspurl = rtspurl;
	}

	public String getStreampath() {
		return streampath;
	}

	public void setStreampath(String streampath) {
		this.streampath = streampath;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	
}
