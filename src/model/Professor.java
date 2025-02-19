package model;

public class Professor {
//1. variables
	private long pId;
	private  String name ; 
	private String surname;
	private Degree degree;
	
	private static long counter = 10000;

	public long getpId() {
		return pId;
	}
	//2. getter
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Degree getDegree() {
		return degree;
	}
	//3. setter
	public void setpId() {
		pId = counter;
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
		if(inputSurname!= null && inputSurname.matches("[A-Z]{1}[a-z]{3,15}")) {
			name = inputSurname;
		}
		else {
			name = "No Name";
		}
	}

	public void setDegree(Degree inputDegree) {
		
		if(inputDegree!=null)
		{
			degree = inputDegree;
		}
		else
		{
			degree = Degree.other;
		}
	}
	
	
	
	
	
	//4. default constructor
	public Professor() {
		setpId();
		setName("test");
		setSurname("test");
		setDegree(Degree.other);
	}
	//5. argument constructor
	public Professor(String inputName, String inputSurname, Degree degree) {
		setpId();
		setName(inputName);
		setSurname(inputSurname);
		setDegree(degree);
		
		
	}
	//6. toString method
	
	public String toString()
	{
		return pId + ": " + degree + " " + name + " " + surname;
	}
	//7. other functions
}
