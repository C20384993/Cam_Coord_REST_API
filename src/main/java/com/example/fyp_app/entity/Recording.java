package com.example.fyp_app.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Entity annotation defines class as being mapped to a table.
@Entity
@Table(name="Recording")
public class Recording {
	
	@Id//Marks the primary key of the table.
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Primary key auto-increments.
    private int recordingid;
	
	@Column(name = "customname")
    private String customname;

	@Column(name = "creationdate")
	@CreationTimestamp
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private String creationdate;
	
	@Column(name = "relativefilepath")
    private String relativefilepath;
	
	@Column(name = "userid")
    private int userid;
    
	@Column(name = "cameraid")
    private int cameraid;
	
	

	public int getRecordingid() {
		return recordingid;
	}

	public void setRecordingid(int recordingid) {
		this.recordingid = recordingid;
	}
	
	public String getCustomname() {
		return customname;
	}

	public void setCustomname(String customname) {
		this.customname = customname;
	}

	public String getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}

	public String getRelativefilepath() {
		return relativefilepath;
	}

	public void setRelativefilepath(String relativefilepath) {
		this.relativefilepath = relativefilepath;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getCameraid() {
		return cameraid;
	}

	public void setCameraid(int cameraid) {
		this.cameraid = cameraid;
	}
	
}