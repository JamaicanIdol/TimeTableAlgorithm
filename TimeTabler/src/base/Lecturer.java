package base;

import java.util.ArrayList;

public class Lecturer extends User{
	private Date dateEmployed;
	private String certification;
	private ArrayList<Classes> classes;
	
	//Default Constructor
	public Lecturer() {
		super();
		dateEmployed=null;
		certification="";
		classes=null;
	}
	
	//Primary Constructors
	public Lecturer(Date dateEmployed, String certification) {
		super();
		this.dateEmployed = dateEmployed;
		this.certification = certification;
		classes = null;
	}

	//Getters and Setters
	public Date getDateEmployed() {
		return dateEmployed;
	}
	public void setDateEmployed(Date dateEmployed) {
		this.dateEmployed = dateEmployed;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public ArrayList<Classes> getClasses() {
		return classes;
	}
	public void setClasses(ArrayList<Classes> classes) {
		this.classes = classes;
	}
}
