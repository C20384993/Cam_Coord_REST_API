package com.example.fyp_app.service;

import com.example.fyp_app.entity.Account;

//Where the business logic methods are defined, e.g. Recording getByID.
//Need to plan what methods will be needed for the app.
public interface AccountService {
	
	Account createAccount(Account user); //Create/Add account
	
	Account getAccountById(int userid); //Read/Get account
	
	boolean updateAccount(Account user); //Update/Edit account
	  
	boolean deleteAccount(int userid); //Delete account
	
	Account getAccountByUsername(String username); //Read/Get account by username

}
