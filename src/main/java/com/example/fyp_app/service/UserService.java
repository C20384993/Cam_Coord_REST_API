package com.example.fyp_app.service;

import java.util.List;

import com.example.fyp_app.entity.User;

public interface UserService {
	boolean create(User user);
	
	User getById(int userid);
	
	User getByUsername(String username);
  
	List<User> getAll();
  
	boolean update(User user);
  
	boolean delete(int userid);

}
