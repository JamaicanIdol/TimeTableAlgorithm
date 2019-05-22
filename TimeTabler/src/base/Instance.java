package base;

import java.util.ArrayList;

public class Instance {
	//Attribute
	private String instance_ID;
	private String course_Name;
	private String course_ID;
	private ArrayList<Classes> classes;
	
	
	//Primary Constructor
	public Instance(String instanceID, String course_Name, String course_ID) {
		this.instance_ID = instanceID;
		this.course_Name = course_Name;
		this.course_ID = course_ID;
		classes=null;
	}
	
	
	//Default Constructor
	public Instance() {
		instance_ID="";
		course_Name="";
		course_ID="";
		classes=null;
		
	}



	//Getters and Setters
	public String getInstanceID() {
		return instance_ID;
	}
	public void setInstanceID(String instance_ID) {
		this.instance_ID = instance_ID;
	}
	public String getCourse_Name() {
		return course_Name;
	}
	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}
	public String getCourse_ID() {
		return course_ID;
	}
	public void setCourse_ID(String course_ID) {
		this.course_ID = course_ID;
	}
	public ArrayList<Classes> getClasses() {
		return classes;
	}
	public void setClasses(ArrayList<Classes> classes) {
		this.classes = classes;
	}
	
	
	
	
}
