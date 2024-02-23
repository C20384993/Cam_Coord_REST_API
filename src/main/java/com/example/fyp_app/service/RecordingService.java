package com.example.fyp_app.service;

import java.util.List;

import com.example.fyp_app.entity.Recording;

public interface RecordingService{
	
	Recording createRecording(Recording recording); //Create/Add a recording entry
	
	Recording getRecordingById(int recordingid); //Read/Get a recording entry
	
	Recording updateRecording(Recording recording); //Update/Edit a recording entry, NOT NEEDED
	  
	boolean deleteRecording(int recordingid); //Delete a recording.

	List<Recording> findAllByUserid(int userid); //Get a list of recordings for the user.

}