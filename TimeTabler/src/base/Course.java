package base;

import java.util.ArrayList;

public class Course {
	//Attributes
	private String course_ID;
	private int credits;
	private int level;
	private int priority;
	private int frequency;
	private String course_Name;
	private String prerequisite;
	private ArrayList<Instance> listOfInstances;
	
	//Primary Constructor
	public Course(String course_ID, int credits, int level, String course_Name) {
		this.course_ID=course_ID;
		this.credits=credits;
		this.level=level;
		this.course_Name =course_Name;
		priority=0;
		frequency=1;
		prerequisite="";
		listOfInstances=null;
		
	}
		
	
	//Secondary Constructor
	public Course(String course_ID, int credits, int level, int priority, int frequency, String course_Name, String prerequisite) {
		this.course_ID = course_ID;
		this.credits = credits;
		this.level = level;
		this.priority = priority;
		this.frequency = frequency;
		this.course_Name = course_Name;
		this.prerequisite = prerequisite;
		listOfInstances=null;
	}


	//Getters and Setters
	public String getCourse_ID() {
		return course_ID;
	}
	public void setCourse_ID(String course_ID) {
		this.course_ID = course_ID;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public String getCourse_Name() {
		return course_Name;
	}
	public void setCourse_Name(String courseName) {
		this.course_Name = courseName;
	}
	public String getPrerequisite() {
		return prerequisite;
	}
	public void setPrerequisite(String prerequisite) {
		this.prerequisite = prerequisite;
	}
	public ArrayList<Instance> getListOfInstances() {
		return listOfInstances;
	}
	public void setListOfInstances(ArrayList<Instance> listOfInstances) {
		this.listOfInstances = listOfInstances;
	}
	
}
