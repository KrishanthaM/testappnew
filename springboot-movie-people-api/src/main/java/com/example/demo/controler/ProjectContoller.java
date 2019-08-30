package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Project;
import com.example.demo.service.ProjectService;

@RestController
@RequestMapping ("/api")
public class ProjectContoller {
	@Autowired
	private ProjectService projService;
	
	@GetMapping ("/project")
	public List <Project> getAllProjects() {
		return projService.getAllProject();
	}
}
