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
import com.example.fyp_app.entity.User;
import com.example.fyp_app.service.UserService;

@RestController
@RequestMapping(value= "/Users")
public class UserController {
	
    @Autowired UserService userService;
    
    @PostMapping
    public boolean create(@RequestBody User user) {
    	System.out.println("Create controller");
    	return userService.create(user);
    }
    
    @GetMapping
    public List<User> getAll() {
    	return userService.getAll();
    }

    //Map any URL request with "/id" to this method.
    @GetMapping("/id")
    public User getById(@RequestParam(value = "id", defaultValue = "0") int id) {
    	return userService.getById(id);
    }
    
    //Map any URL request with "/username" to this method.
    @GetMapping("/username")
    public User getByUsername(@RequestParam(value = "username", defaultValue = "0") String username) {
    	return userService.getByUsername(username);
    }
    
    @PutMapping
    public boolean update(@RequestBody User user) {
    	return userService.update(user);
    }
   
    @DeleteMapping
    public boolean delete(@RequestParam int id) {
    	return userService.delete(id);
    }

}
