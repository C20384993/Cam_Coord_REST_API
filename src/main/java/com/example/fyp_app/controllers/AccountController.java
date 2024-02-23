package com.example.fyp_app.controllers;

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

//Controller classes handle HTTP requests.
//Mapping URL to controller: 8081/(Entity)/ e.g. 8081/Accounts/(path)
//Any request with that ending will be handled by the appropriate controller.
//Controller passes it to ServiceImplem file to actually perform operations.
@RestController
@RequestMapping(value= "/Accounts")
public class AccountController {
	
    @Autowired AccountService accountService;
    
    @PostMapping("/create")
    public Account createAccount(@RequestBody Account account) {
    	System.out.println("Create controller");
    	System.out.println("username="+account.getUsername());
    	System.out.println("password="+account.getPassword());
    	return accountService.createAccount(account);
    }
    
    //Map any URL request with "/id" to this method, e.g. /Accounts/id
    @GetMapping("/getbyid")
    public Account getAccountById(@RequestParam(value = "id", defaultValue = "0") int id) {
    	System.out.println("userid="+id);
    	return accountService.getAccountById(id);
    }
    
    @GetMapping("/getbyusername")
    public Account getAccountByUsername(@RequestParam(value = "username", defaultValue = "0") String username) {
    	return accountService.getAccountByUsername(username);
    }
    
    @PutMapping("/update")
    public boolean updateAccount(@RequestBody Account account) {
    	return accountService.updateAccount(account);
    }
   
    @DeleteMapping("/delete")
    public boolean delete(@RequestParam int userid) {
    	return accountService.deleteAccount(userid);
    }

}
