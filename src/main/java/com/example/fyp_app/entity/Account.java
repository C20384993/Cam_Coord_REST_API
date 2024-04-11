package com.example.fyp_app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Data Model for Account
//Entity annotation defines class as being mapped to a table.
@Entity
@Table(name="Account")
public class Account {
	
	@Id//Marks the primary key of the table.
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Primary key auto-increments.
    private int userid;
	
	@Column(name = "username")
    private String username;
	
	@Column(name = "password")
    private String password;
	
	@Column(name = "salt")
    private String salt;

	
	public int getUserid() {
        return userid;
    }
	
	public void setUserid(int userid) {
        this.userid = userid;
    }
	
	
	public String getUsername() {
        return username;
    }
	
	public void setUsername(String username) {
        this.username = username;
    }
	
	
	public String getPassword() {
        return password;
    }
	
	public void setPassword(String password) {
        this.password = password;
    }
	
	public String getSalt() {
        return salt;
    }
	
	public void setSalt(String salt) {
        this.salt = salt;
    }
	
	
}
