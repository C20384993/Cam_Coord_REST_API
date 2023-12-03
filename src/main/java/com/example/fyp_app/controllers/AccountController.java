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
import com.example.fyp_app.entity.Account;
import com.example.fyp_app.service.AccountService;

@RestController
@RequestMapping(value= "/Accounts")
public class AccountController {
	
    @Autowired AccountService accountService;
    
    @PostMapping
    public boolean create(@RequestBody Account account) {
    	System.out.println("Create controller");
    	return accountService.create(account);
    }
    
    @GetMapping
    public List<Account> getAll() {
    	return accountService.getAll();
    }

    //Map any URL request with "/id" to this method.
    @GetMapping("/id")
    public Account getById(@RequestParam(value = "id", defaultValue = "0") int id) {
    	return accountService.getById(id);
    }
    
    //Map any URL request with "/username" to this method.
    @GetMapping("/username")
    public Account getByUsername(@RequestParam(value = "username", defaultValue = "0") String username) {
    	return accountService.getByUsername(username);
    }
    
    @PutMapping
    public boolean update(@RequestBody Account account) {
    	return accountService.update(account);
    }
   
    @DeleteMapping
    public boolean delete(@RequestParam int id) {
    	return accountService.delete(id);
    }

}
