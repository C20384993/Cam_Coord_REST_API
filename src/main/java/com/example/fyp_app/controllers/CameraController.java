package com.example.fyp_app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.fyp_app.entity.Camera;
import com.example.fyp_app.service.CameraService;

@RestController
@RequestMapping(value= "/Cameras")
public class CameraController {
	
    @Autowired CameraService cameraService;
    
    @PostMapping
    public boolean create(@RequestBody Camera camera) {
    	System.out.println("Create controller");
    	return cameraService.create(camera);
    }
    
    @GetMapping
    public List<Camera> getAll() {
    	return cameraService.getAll();
    }

    //Map any URL request with "/id" to this method.
    @GetMapping("/id")
    public Camera getById(@RequestParam(value = "id", defaultValue = "1") int id) {
    	return cameraService.getByID(id);
    }
    
    @PutMapping
    public boolean update(@RequestBody Camera camera) {
    	return cameraService.update(camera);
    }
   
    @DeleteMapping
    public boolean delete(@RequestParam int id) {
    	return cameraService.delete(id);
    }

}
