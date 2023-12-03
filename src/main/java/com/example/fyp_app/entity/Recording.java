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
	
	@Column(name = "recordingname")
    private String recordingname;
	
	@Column(name = "creationdate")
	@CreationTimestamp
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private String creationdate;
	
	@Column(name = "userid")
    private int userid;
    
	@Column(name = "relativefilepath")
    private String relativefilepath;
    
	@Column(name = "cameraid")
    private int cameraid;

    public int getRecordingid() {
        return recordingid;
    }

    public void setRecordingid(int fileid) {
        this.recordingid = fileid;
    }

    public String getRecordingname() {
        return recordingname;
    }

    public void setRecordingname(String filename) {
        this.recordingname = filename;
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getRelativefilepath() {
        return relativefilepath;
    }

    public void setRelativefilepath(String relativefilepath) {
        this.relativefilepath = relativefilepath;
    }

    public int getCameraid() {
        return cameraid;
    }

    public void setCameraid(int camerasid) {
        this.cameraid = camerasid;
    }
}