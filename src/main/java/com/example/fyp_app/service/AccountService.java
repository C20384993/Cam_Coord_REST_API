package com.example.fyp_app.service;

import java.util.List;

import com.example.fyp_app.entity.Account;

public interface AccountService {
	boolean create(Account user);
	
	Account getById(int userid);
	
	Account getByUsername(String username);
  
	List<Account> getAll();
  
	boolean update(Account user);
  
	boolean delete(int userid);

}
