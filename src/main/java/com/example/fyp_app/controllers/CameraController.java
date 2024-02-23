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
    
    @PostMapping("/create")
    public Camera createCamera(@RequestBody Camera camera) {
    	System.out.println("");
    	System.out.println("Create Cam controller");
    	System.out.println("cameraid="+camera.getCameraid());
		System.out.println("userid="+camera.getUserid());
		System.out.println("customname="+camera.getCustomname());
		System.out.println("camusername="+camera.getCamusername());
		System.out.println("campassword="+camera.getCampassword());
		System.out.println("rtspurl="+camera.getRtspurl());
		System.out.println("streampath="+camera.getStreampath());
    	return cameraService.createCamera(camera);
    }

    @GetMapping("/getbyid")
    public Camera getCameraBySerialNumber(@RequestParam(value = "id", defaultValue = "1") int cameraid) {
    	return cameraService.getCameraById(cameraid);
    }
    
    @PutMapping("/update")
    public Camera updateCamera(@RequestBody Camera camera) {
    	System.out.println("cameraid="+camera.getCameraid());
		System.out.println("userid="+camera.getUserid());
		System.out.println("customname="+camera.getCustomname());
    	return cameraService.updateCamera(camera);
    }
   
    @DeleteMapping("/delete")
    public boolean deleteCamera(@RequestParam int cameraid) {
    	return cameraService.deleteCamera(cameraid);
    }
    
    @GetMapping("/findall")
    public List<Camera> findAllByUserId(@RequestParam(value = "userid") int userid) {
        return cameraService.findAllByUserid(userid);
    }

}
