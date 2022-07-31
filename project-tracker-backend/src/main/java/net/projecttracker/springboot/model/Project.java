package net.projecttracker.springboot.model;

public class Project {
	private long id;
	private String projectName;
	public long getId() {
		return id;
	}
	public Project() {
		
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Project(String projectName) {
		super();
		this.projectName = projectName;
	}
	
}
