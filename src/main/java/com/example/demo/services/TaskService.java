package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Task;
import com.example.demo.repositories.TaskRepository;

@Service
public class TaskService {
	
	@Autowired 
	TaskRepository TaskRepo;
	
	public Task saveTask(Task task) {
		 TaskRepo.save(task);
		 return task;
	}

}
