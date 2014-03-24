package org.learnjava.lesson1;

public class Requester {
	//fields
	private String name; //name of the task requester
	private int taskComplete; // status of task
	
	//constructors
	public Requester(){
		name = "Unknown";
		taskComplete = 0;
	}
	
	public String getRequesterName(){
		return name;
	}
	
	public int getTaskStatus() {
		return taskComplete;
	}
	
	public void setRequesterName(String anyName) {
		name = anyName;
	}
	
	public void setTaskStatus(int status) {
		taskComplete = status;
	}

	public Task defineTask(String s1, String s2){
		Task t1 = new Task(s1, s2);
		return t1;
	}
}
