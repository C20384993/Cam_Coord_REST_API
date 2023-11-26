package com.example.fyp_app.service;

import java.util.List;

import com.example.fyp_app.entity.Camera;

public interface CameraService {
	boolean create(Camera camera);
	
	Camera getByID(int cameraid);
  
	List<Camera> getAll();
  
	boolean update(Camera camera);
  
	boolean delete(int cameraid);

}
