package base;

import java.util.ArrayList;

public class Student extends User {
	private Date dateRegistered;
	private boolean registered;
	private String degreeCode;
	private ArrayList<Classes> courses_Completed;	
		
	
	//Default Constructor
	public Student() {
		super();
		dateRegistered=null;
		registered=false;
		degreeCode="";
		courses_Completed=null;
	}
	
	
	//Primary Constructor
	public Student(Date dateRegistered, boolean registered, String degreeCode) {
		super();
		this.dateRegistered = dateRegistered;
		this.registered = registered;
		this.degreeCode = degreeCode;
		courses_Completed = null;
	}
	
	
	//Getters and Setters
	public Date getDateRegistered() {
		return dateRegistered;
	}
	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}
	public boolean isRegistered() {
		return registered;
	}
	public void setRegistered(boolean registered) {
		this.registered = registered;
	}
	public String getDegreeCode() {
		return degreeCode;
	}
	public void setDegreeCode(String degreeCode) {
		this.degreeCode = degreeCode;
	}
	public ArrayList<Classes> getCourses_Completed() {
		return courses_Completed;
	}
	public void setCourses_Completed(ArrayList<Classes> courses_Completed) {
		this.courses_Completed = courses_Completed;
	}
	
	

}
