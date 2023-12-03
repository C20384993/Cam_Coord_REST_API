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
import com.example.fyp_app.entity.Recording;
import com.example.fyp_app.service.RecordingService;

@RestController
@RequestMapping(value= "/Recordings")
//Controller classes can take HTTP requests.
//Mapping URL to controller: 8080/api/Files
//Any request with that ending will be handled by this controller. Controller passes it to Implem file to
//actually perform operations.
public class RecordingController {

    @Autowired RecordingService recordingService;
    
    @PostMapping
    public boolean create(@RequestBody Recording recording) {
    	System.out.println("Create controller");
    	return recordingService.create(recording);
    }
    
    @GetMapping
    public List<Recording> getAll() {
    	return recordingService.getAll();
    }

    //Map any URL request with "/id" to this method.
    @GetMapping("/id")
    public Recording getById(@RequestParam(value = "id", defaultValue = "1") int id) {
    	return recordingService.getByID(id);
    }
    
    @PutMapping
    public boolean update(@RequestBody Recording recording) {
    	return recordingService.update(recording);
    }
   
    @DeleteMapping
    public boolean delete(@RequestParam int id) {
    	return recordingService.delete(id);
    }

}