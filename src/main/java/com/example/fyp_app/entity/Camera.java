package com.example.fyp_app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Entity annotation defines class as being mapped to a table.
@Entity
@Table(name="Camera")
public class Camera {
	
	@Id//Marks the primary key of the table.
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Primary key auto-increments.
    private int cameraid;
	
	@Column(name = "cameraname")
	private String cameraname;
	
	@Column(name = "camusername")
	private String camusername;
	
	@Column(name = "campassword")
	private String campassword;
	
	@Column(name = "userid")
	private int userid;

	
	public int getCameraid() {
        return cameraid;
    }
	
	public void setCameraid(int cameraid) {
        this.cameraid = cameraid;
    }
	
	
	public String getCameraname() {
        return cameraname;
    }
	
	public void setCameraname(String cameraname) {
        this.cameraname = cameraname;
    }
	
	
	public String getCampassword() {
        return campassword;
    }
	
	public void setCampassword(String campassword) {
        this.campassword = campassword;
    }
	
	
	public String getCamerausername() {
        return cameraname;
    }
	
	public void setCamerausername(String camerausername) {
        this.camusername = camerausername;
    }
	
	
	public int getUserid() {
        return userid;
    }
	
	public void setUserid(int userid) {
        this.userid = userid;
    }
	
}
