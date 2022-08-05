package net.projecttracker.springboot.controller;

import java.util.List;
import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.projecttracker.springboot.exception.ResourceNotFoundException;
import net.projecttracker.springboot.model.Project;
import net.projecttracker.springboot.repositry.ProjectRepositry;

@RestController
@RequestMapping("/api/v1/")
public class ProjectController {
	@Autowired
	private ProjectRepositry projectRepositry;
	
	// get all projects
	@GetMapping("/projects")
	public List<Project> getAllProjects(){
		return projectRepositry.findAll();
	}	
	
	// create project rest api
	@PostMapping("/projects")
	public Project createProject(@RequestBody Project project) {
		return Project.save(project);
	}
	
}
