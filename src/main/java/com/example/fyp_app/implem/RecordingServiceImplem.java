package com.example.fyp_app.implem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.fyp_app.entity.Recording;
import com.example.fyp_app.repository.RecordingRepository;
import com.example.fyp_app.service.RecordingService;

//Service layer, business logic is contained here to keep separate from controller.
//Where the actual logic of the FileService.java Interface methods is implemented.
@Service
public class RecordingServiceImplem implements RecordingService{

	@Autowired RecordingRepository recordingRepository; //Autowired auto injects dependent beans into associated refs of a POJO class.
	
    @Override
    public Recording getByID(int recordingid) {
        //Pass an ID, create object for it, return all data from entry with that FileID.
    	//The ID value is gotten from the URL.
    	Recording r = recordingRepository.findById(recordingid).orElse(null);
        return r;
    }

	@Override
	public List<Recording> getAll() {
		// SELECT * FROM Files
		List<Recording> recordingList = recordingRepository.findAll();
		return recordingList;
	}

	@Override
	public boolean update(Recording recording) {
		// UPDATE Files SET Filename=... WHERE FileID = n;
		recordingRepository.save(recording);
		return true;
	}

	@Override
	public boolean delete(int recordingid) {
		// DELETE FROM Files WHERE FileID = n;
		recordingRepository.deleteById(recordingid);
		return true;
	}

	@Override
	public boolean create(@RequestBody Recording recording) {
		// INSERT INTO Files(columns) VALUES (values) 
		System.out.println("recordingname: "+recording.getRecordingname());
		System.out.println("userid: "+recording.getUserid());
		System.out.println("filepath: "+recording.getRelativefilepath());
		System.out.println("camerasid: "+recording.getCameraid());
		recordingRepository.save(recording);
		return true;
	}

}
