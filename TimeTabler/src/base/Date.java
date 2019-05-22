package base;

public class Date {
	//Attributes
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	
	
	//Primary Constructor
		public Date(int day, int month, int year) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
		
		
		//Default Constructor
		public Date() { 
			day=1;
			month=1;
			year=2019;	
		}
	
	//Getters and Setters
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	//Display Function
	public void display() {
		System.out.println("Date: "+day+"/"+month+"/"+year+".");
	}
	
	
	

}
