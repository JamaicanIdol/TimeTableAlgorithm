package base;

public abstract class User {
	protected String user_ID;
	protected String user_Name;
	protected Date dateOfBirth;
	protected Date dateAdded;//Date Added to the system
	protected int age;
	
	
	//Default Constructor	
	public User() {
		user_ID="";
		user_Name="";
		dateOfBirth=null;
		dateAdded=null;
		age=1;
	}


	//Primary Constructor
	public User(String user_ID, String user_Name, Date dateOfBirth, Date dateAdded, int age) {
		this.user_ID = user_ID;
		this.user_Name = user_Name;
		this.dateOfBirth = dateOfBirth;
		this.dateAdded = dateAdded;
		this.age=age;
	}
	
	
	//Getters and Setters
	public String getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
}
