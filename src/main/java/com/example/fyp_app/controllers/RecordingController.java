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
public class RecordingController {

    @Autowired RecordingService recordingService;
    
    @PostMapping("/create")
    public Recording createRecording(@RequestBody Recording recording) {
    	return recordingService.createRecording(recording);
    }

    @GetMapping("/getbyid")
    public Recording getRecordingById(@RequestParam(value = "id", defaultValue = "1") int recordingid) {
    	return recordingService.getRecordingById(recordingid);
    }
    
    @PutMapping("/update")
    public Recording updateRecording(@RequestBody Recording recording) {
    	return recordingService.updateRecording(recording);
    }
   
    @DeleteMapping("/delete")
    public boolean deleteRecording(@RequestParam int recordingid) {
    	return recordingService.deleteRecording(recordingid);
    }
    
    @GetMapping("/findall")
    public List<Recording> findByUserId(@RequestParam(value = "userid") int userid) {
        return recordingService.findAllByUserid(userid);
    }

}