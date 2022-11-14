package com.example.axisTasks.service;

import java.util.List;

import com.example.axisTasks.createuser.CreateUser;
import com.example.axisTasks.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService{

	public User findByUserName(String username);
	
	public void save(CreateUser createUser);
	
	public List<User> getAllUsers();
}
