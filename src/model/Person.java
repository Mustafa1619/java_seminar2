package model;

public class Person {
	protected String name;
	protected String surname;
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
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
		if(inputSurname!= null && inputSurname.matches("[A-Z]{1}[a-z]{3,15}")) {
			surname = inputSurname;
		}
		else {
			surname = "No Surname";
		}
	}
	
	public Person() {
		setName("Test");
		setSurname("Person");
	}
	
	public Person(String name, String surname) {
		setName(name);
		setSurname(surname);
	}
	
	public String toString() {
		return name+ " " + surname;
	}
}
