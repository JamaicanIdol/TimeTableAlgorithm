package base;

public class Classes {
	private int duration;
	private String type;
	private String course_ID;
	private String instance_ID;
	private int size;
	

	//Primary Constructors
	public Classes(int duration, String type, String course_ID, String instance_ID, int size) {
		this.duration = duration;
		this.type = type;
		this.course_ID = course_ID;
		this.instance_ID = instance_ID;
		this.size = size;
	}
	
	//Default Constructor
	public Classes() {
		duration=1;
		type="";
		course_ID="";
		instance_ID="";
		size=1;
	}


	//Setters and Getters
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCourse_ID() {
		return course_ID;
	}
	public void setCourse_ID(String course_ID) {
		this.course_ID = course_ID;
	}
	public String getInstance_ID() {
		return instance_ID;
	}
	public void setInstance_ID(String instance_ID) {
		this.instance_ID = instance_ID;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
