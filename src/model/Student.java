package model;

public class Student extends Person{
/*
 * variables
 */ private long stID;

 	private int counter;
	
 	public long getStID() {
		return stID;
	}
	
	
	public void setStID() {
		stID= counter;
		counter++;
	}
	
	
	//default constructor
	public Student() {
		super();
		setStID();
	}
	// argument constructor
	public Student(String inputName, String inputSurname) {
		super(inputName,inputSurname);
		setStID();
	}
	
	//string function
	
	public String toString() {
		{
			return stID + ": " + super.toString();
		}
		
	}
	
	
	
}
