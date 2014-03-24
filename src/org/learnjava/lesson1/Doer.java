package org.learnjava.lesson1;

@DocAnnotation(author = "Pavan", date = "3/20/2014")

public class Doer {
	//fields
	private String name; //name of the task doer
	private String relation; // relation to the requester
	private Task Task;
	
	//constructors
	public Doer(){
		name = "Unknown";
		relation = "Friend";
	}
	
	public String getDoerName () {
		return name;
	}
	
	public String getRelation () {
		return relation;
	}
	
	public void setDoerName (String anyName){
		name = anyName;
	}
	
	public void setRelation (String anyRelation){
		relation = anyRelation;
	}
	
	public void pickupTask(Task T){
		this.Task = T;
		T.doTask();
		T.taskComplete();
	}
	
	public void dropTask(Task T){
		this.Task = T;
	}
	
	public String toString(){
		return getDoerName() + " " + getRelation();
	}
}
