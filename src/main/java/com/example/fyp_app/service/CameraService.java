package com.example.fyp_app.service;

import java.util.List;

import com.example.fyp_app.entity.Camera;

public interface CameraService {
	
	Camera createCamera(Camera camera); //Create/Add a camera entry
	
	Camera getCameraById(int cameraid); //Read/Get by Primary Key
  
	Camera updateCamera(Camera camera); //Update/Edit camera entry
  
	boolean deleteCamera(int cameraid); //Delete camera entry
	
	List<Camera> findAllByUserid(int userid); //Read/Get all camera entries for a user

}
