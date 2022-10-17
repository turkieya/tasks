package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Task;
import com.example.demo.services.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired 
	TaskService taskService;
	
	@PostMapping(path="/add")
	public Task addTask(@RequestBody Task task) {
		return taskService.saveTask(task);
	}
}   
