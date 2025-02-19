package model;

public class Student {
/*
 * variables
 */ private long stID;
 	private String name;
 	private String surname;
 	private int counter;
	
 	public long getStID() {
		return stID;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	public void setStID() {
		stID= counter;
		counter++;
	}
	
	public void setName(String inputName) {
		if(inputName!= null && inputName.matches("[A-Z]{1}[a-z]{3,15}")) {
			name = inputName;
		}
		else {
			name = "No Name";
		}
	}
	
	public void setSurname(String inputSurname) {
		if(inputSurname != null && inputSurname.matches("[A-Z]{1}[a-z]{3,15}")) {
			surname = inputSurname;
			
		}
		else {
		surname = "No Surname";
		}
	}
	//default constructor
	public Student() {
		setStID();
		setName("Test");
		setSurname("Test");
	}
	// argument constructor
	public Student(String inputName, String inputSurname) {
		setStID();
		setName(inputName);
		setSurname(inputSurname);
	}
	
	//string function
	
	public String toString() {
		{
			return stID + ": " + name + " " + surname;
		}
		
	}
	
	
	
}
