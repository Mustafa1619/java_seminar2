package model;

public class Professor extends Person{
//1. variables
	private long pId;
	private Degree degree;
	
	private static long counter = 10000;

	public long getpId() {
		return pId;
	}
	//2. getter
	
	public Degree getDegree() {
		return degree;
	}
	//3. setter
	public void setpId() {
		pId = counter;
		counter++;
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
		super();
		setpId();
		setDegree(Degree.other);
	}
	//5. argument constructor
	public Professor(String inputName, String inputSurname, Degree degree) {
		super(inputName,inputSurname);
		setpId();
		setDegree(degree);
		
		
	}
	//6. toString method
	
	public String toString()
	{
		return pId + ": " + degree + " " + super.toString();
	}
	//7. other functions
}
