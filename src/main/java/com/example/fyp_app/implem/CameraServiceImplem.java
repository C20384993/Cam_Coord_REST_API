package com.example.fyp_app.implem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fyp_app.entity.Camera;
import com.example.fyp_app.repository.CameraRepository;
import com.example.fyp_app.service.CameraService;

@Service
public class CameraServiceImplem implements CameraService{
	
	@Autowired CameraRepository cameraRepository; //Autowired auto injects dependent beans into associated refs of a POJO class.

	@Override
	public boolean create(Camera camera) {
		// INSERT INTO Files(columns) VALUES (values) 
		//Convert creationdate to datetime format.
		cameraRepository.save(camera);
		return true;
	}

	@Override
	public Camera getByID(int cameraid) {
		//Pass an ID, create object for it, return all data from entry with that FileID.
    	//The ID value is gotten from the URL.
        //Recording f = new Recording();
    	Camera c = cameraRepository.findById(cameraid).orElse(null);
        return c;
	}

	@Override
	public List<Camera> getAll() {
		// SELECT * FROM Files
		List<Camera> cameraList = cameraRepository.findAll();
		return cameraList;
	}

	@Override
	public boolean update(Camera camera) {
		// UPDATE Files SET Filename=... WHERE FileID = n;
		cameraRepository.save(camera);
		return true;
	}

	@Override
	public boolean delete(int cameraid) {
		// DELETE FROM Files WHERE FileID = n;
		cameraRepository.deleteById(cameraid);
		return true;
	}

}
