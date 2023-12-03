package com.example.fyp_app.service;

import java.util.List;

import com.example.fyp_app.entity.Recording;

//Where the business logic methods are defined, e.g. Recording getByID.
//Need to plan what methods will be needed for the app.
public interface RecordingService{
	boolean create(Recording recording);
	
	Recording getByID(int recordingid);
  
	List<Recording> getAll();
  
	boolean update(Recording recording);
  
	boolean delete(int recordingid);

}