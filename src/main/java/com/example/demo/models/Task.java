package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String blocked;
	private String issues;
	private String help;
	private String label;
	private String sublabel;
	private String priority;
	private String duration;
	private String duration_confidence;
	private String start_date;
	private String end_date;
	private String status;
	private String complexity;
	private String task_group;
	private String description;
	private String ref;
	private String technical_dependencies;
	private String temporal_dependencies;
	private String computed_dependencies;
	private String progress;
	
	public Task (String username,String blocked,String issues,String help,String label,String sublabel,String priority,String duration,String duration_confidence, 
			String start_date,String end_date,String status,String complexity,String task_group,String description,String ref,String technical_dependencies,
			String temporal_dependencies,String computed_dependencies,String progress
			) {
		this.username=username;
		this.blocked=blocked;
		this.issues=issues;
		this.help=help;
		this.label=label;
		this.sublabel=sublabel;
		this.priority=priority;
		this.duration=duration;
		this.duration_confidence=duration_confidence;
		this.start_date=start_date;
		this.end_date=end_date;
		this.status=status;
		this.complexity=complexity;
		this.task_group=task_group;
		this.description=description;
		this.ref=ref;
		this.technical_dependencies=technical_dependencies;
		this.temporal_dependencies=temporal_dependencies;
		this.computed_dependencies=computed_dependencies;
		this.progress=progress;
	}
	
}
