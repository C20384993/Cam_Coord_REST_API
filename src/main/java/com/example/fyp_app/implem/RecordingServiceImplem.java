package com.example.fyp_app.implem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.fyp_app.entity.Recording;
import com.example.fyp_app.repository.RecordingRepository;
import com.example.fyp_app.service.RecordingService;

@Service
public class RecordingServiceImplem implements RecordingService{

	@Autowired RecordingRepository recordingRepository; //Autowired auto injects dependent beans into associated refs of a POJO class.

	@Override
	public Recording createRecording(Recording recording) {
		recordingRepository.save(recording);
		
		Recording r = new Recording();
		r.setRecordingid(recording.getRecordingid());
		r.setCustomname(recording.getCustomname());
		r.setCreationdate(recording.getCreationdate());
		r.setRelativefilepath(recording.getRelativefilepath());
		r.setUserid(recording.getUserid());
		r.setCameraid(recording.getCameraid());
		return r;
	}

	@Override
	public Recording getRecordingById(int recordingid) {
		Recording r = recordingRepository.findById(recordingid).orElse(null);
        return r;
	}

	@Override
	public Recording updateRecording(Recording recording) {
	
		Recording r = new Recording();
		r.setRecordingid(recording.getRecordingid());
		r.setCustomname(recording.getCustomname());
		r.setCreationdate(recording.getCreationdate());
		r.setRelativefilepath(recording.getRelativefilepath());
		r.setUserid(recording.getUserid());
		r.setCameraid(recording.getCameraid());
		
		if(recordingRepository.existsById(recording.getRecordingid())==true) {
			recordingRepository.saveAndFlush(recording);
			return r;
		}
		else {
			return null;
		}
	}

	@Override
	public boolean deleteRecording(int recordingid) {
		recordingRepository.deleteById(recordingid);
		return true;
	}

	@Override
	public List<Recording> findAllByUserid(int recordingid) {
		List<Recording> r = recordingRepository.findAllByUserid(recordingid);
        return r;
	}

}
