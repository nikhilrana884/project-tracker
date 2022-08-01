package net.projecttracker.springboot.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import net.projecttracker.springboot.model.Project;


public interface ProjectRepositry extends JpaRepository<Project, Object> {
	
}