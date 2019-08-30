package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Project;
import com.example.demo.entity.ProjectRepository;

@Component
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepo;
	
	public List<Project> getAllProject (){
		return projectRepo.findAll();
	}
}
