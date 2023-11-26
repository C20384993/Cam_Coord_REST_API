package com.example.fyp_app.entity;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Entity annotation defines class as being mapped to a table.
@Entity
@Table(name="Files")
public class Recording {
	@Id//Marks the primary key of the table.
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Primary key auto-increments.
    private int fileid;
	
	@Column(name = "filename")
    private String filename;
	
	@Column(name = "creationdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private String creationdate;
	
	@Column(name = "userid")
    private int userid;
    
	@Column(name = "relativefilepath")
    private String relativefilepath;
    
	@Column(name = "camerasid")
    private int camerasid;

    public int getFileid() {
        return fileid;
    }

    public void setFileid(int fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
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

    public int getCamerasid() {
        return camerasid;
    }

    public void setCamerasid(int camerasid) {
        this.camerasid = camerasid;
    }
}