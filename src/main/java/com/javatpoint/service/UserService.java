package com.javatpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.javatpoint.model.User;

@Service
public class UserService {
	
    @Autowired  
    JdbcTemplate jdbc;	
	    
    public void addUser(User user){
    	String sql = "INSERT INTO user(name,email) VALUES('" + user.getName() + "', '" + user.getEmail() + "')";    	
    	jdbc.execute(sql);
    } 	
}
