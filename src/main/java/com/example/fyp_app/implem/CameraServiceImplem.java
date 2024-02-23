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
	public Camera createCamera(Camera camera) {
		cameraRepository.save(camera);
		
		Camera c = new Camera();
		c.setCameraid(camera.getCameraid());
		c.setCustomname(camera.getCustomname());
		c.setCamusername(camera.getCamusername());
		c.setCampassword(camera.getCampassword());
		c.setRtspurl(camera.getRtspurl());
		c.setStreampath(camera.getStreampath());
		c.setUserid(camera.getUserid());
		return c;
	}

	@Override
	public Camera getCameraById(int cameraid) {
		Camera c = cameraRepository.findById(cameraid).orElse(null);
        return c;
	}

	@Override
	public Camera updateCamera(Camera camera) {
		System.out.println("cameraid="+camera.getCameraid());
		System.out.println("userid="+camera.getUserid());
		System.out.println("customname="+camera.getCustomname());
		
		Camera c = new Camera();
		c.setCameraid(camera.getCameraid());
		c.setCustomname(camera.getCustomname());
		c.setCamusername(camera.getCamusername());
		c.setCampassword(camera.getCampassword());
		c.setRtspurl(camera.getRtspurl());
		c.setStreampath(camera.getStreampath());
		c.setUserid(camera.getUserid());
		
		if(cameraRepository.existsById(camera.getCameraid())==true) {
			cameraRepository.saveAndFlush(camera);
			return c;
		}
		else {
			return null;
		}
	}

	@Override
	public boolean deleteCamera(int cameraid) {
		cameraRepository.deleteById(cameraid);
		return true;
	}

	@Override
	public List<Camera> findAllByUserid(int userid) {
		List<Camera> c = cameraRepository.findAllByUserid(userid);
        return c;
	}
	
}
