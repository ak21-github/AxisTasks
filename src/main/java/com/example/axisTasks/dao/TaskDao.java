package com.example.axisTasks.dao;

import java.util.List;
import java.util.Optional;

import com.example.axisTasks.entity.Task;

public interface TaskDao {

	//add a task
	public void addTask(Task newTask);
	
	//delete a task
	public void deleteTask(int taskId);
	
	//update a task
	//public void updateTask(Task taskId);
	
	//get all tasks
	public List<Task> getUserTasks(int userId);
	public Optional<Task> getByTaskId(int taskId);
}
