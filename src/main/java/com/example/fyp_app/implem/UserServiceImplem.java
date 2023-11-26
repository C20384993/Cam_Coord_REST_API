package com.example.fyp_app.implem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.fyp_app.entity.User;
import com.example.fyp_app.repository.UserRepository;
import com.example.fyp_app.service.UserService;

@Service
public class UserServiceImplem implements UserService{
	
	@Autowired UserRepository userRepository; //Autowired auto injects dependent beans into associated refs of a POJO class.
	
    @Override
    public User getById(int userid) {
        //Pass an ID, create object for it, return all data from entry with that FileID.
    	//The ID value is gotten from the URL.
        //Recording f = new Recording();
    	User u = userRepository.findById(userid).orElse(null);
        return u;
    }

	@Override
	public boolean create(User user) {
		// INSERT INTO Files(columns) VALUES (values) 
		//Convert creationdate to datetime format.
		userRepository.save(user);
		return true;
	}

	@Override
	public List<User> getAll() {
		// SELECT * FROM Files
		List<User> userList = userRepository.findAll();
		return userList;
	}

	@Override
	public boolean update(User user) {
		// UPDATE Files SET Filename=... WHERE FileID = n;
		userRepository.save(user);
		return true;
	}

	@Override
	public boolean delete(int userid) {
		// DELETE FROM Files WHERE FileID = n;
		userRepository.deleteById(userid);
		return true;
	}

	@Override
	public User getByUsername(String username) {
		User u = userRepository.findByUsername(username).orElse(null);
        return u;
	}
	
	
}
