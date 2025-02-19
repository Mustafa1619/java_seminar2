package model;



public class Course {
	private long cId;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter=10000;

	public long getcId() {
		return cId;
	}

	

	public String getTitle() {
		return title;
	}

	

	public int getCreditPoints() {
		return creditPoints;
	}



	public Professor getProfessor() {
		return professor;
	}



	public void setcId() {
		cId = counter++;
	}



	public void setTitle(String inputTitle) {
		if(inputTitle!=null && inputTitle.matches("[A-Za-z ()]{4,20}")) {
			title=inputTitle;
		}else {
			title = "No Title";
		}
	}



	public void setCreditPoints(int inputCreditPoints) {
		if(inputCreditPoints > 0 && inputCreditPoints <= 30) {
			creditPoints = inputCreditPoints;
		}else { 
			creditPoints = 3;
		}
	}


	public void setProfessor(Professor inputProfessor) {
		if(inputProfessor != null) {
			professor = inputProfessor;
		}else {
			professor = new Professor();
		}
	}
	
	public Course() {
		setcId();
		setTitle("Test Course");
		setCreditPoints(3);
		setProfessor(new Professor());
	}
	
	public Course(String inputTitle,int inputCreditPoints,Professor prof) {
		setcId();
		setTitle(inputTitle);
		setCreditPoints(inputCreditPoints);
		setProfessor(prof);
	}
	
	public String toString() {
		return cId + ": " + title + " " + creditPoints + " " + professor;
	}
	
	
}
