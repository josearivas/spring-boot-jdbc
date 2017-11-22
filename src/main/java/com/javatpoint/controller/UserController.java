package com.javatpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.User;
import com.javatpoint.service.UserService;

@RestController
public class UserController {
	
    @Autowired  
    private UserService userService; 
    
    @RequestMapping(value="/users", method=RequestMethod.POST)  
    public String addUser(@RequestBody User user){    	    
        userService.addUser(user);
        return "{\"message\": \"data inserted Successfully\"}";
    }       	
}
