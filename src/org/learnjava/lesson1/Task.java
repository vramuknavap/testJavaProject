package org.learnjava.lesson1;

public class Task {
	//fields
	private String taskName; //name of the task 
	private String taskType; // type of the task
	
	//constructors
	public Task(){
		taskName = "Unknown";
		taskType = "Unknown";
	}
	
	public Task(String name, String type){
		taskName = name;
		taskType = type;
	}
	
	public void doTask(){
		//Task in progress
	}
	
	public void taskComplete(){
		//task complete
	}
	
	public String getTaskName(){
		return taskName;
	}
	
	public void setTaskName(String anyName) {
		taskName = anyName;
	}
	
	public String getTaskType(){
		return taskType;
	}
	
	public void setTaskType(String anyType) {
		taskName = anyType;
	}
}
