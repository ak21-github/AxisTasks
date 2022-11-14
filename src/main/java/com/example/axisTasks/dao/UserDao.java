package com.example.axisTasks.dao;

import java.util.List;

import com.example.axisTasks.entity.User;
//import springbootproject.todolist.entity.User;

public interface UserDao{

	public User findByUsername(String username);
	
	public void save(User user);
	public List<User> getAllUsers();
	
}
