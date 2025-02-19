package model;

public class Grade {
	private long gId;
	private int grValue;
	private Student student;
	private Course course;
	
	private long counter =30000;
	
	
	public long getgId() {
		return gId;
	}
	public int getGrValue() {
		return grValue;
	}
	public Student getStudent() {
		return student;
	}
	public Course getCourse() {
		return course;
	} 

	public void setGId() {
		gId = counter++;
		
	}
	
	public void setGrValue(int InputGrValue) {
		if(InputGrValue>0 && InputGrValue<=10) {
			grValue = InputGrValue;
		}else {
			grValue = 0;
			
		}
	}
	
	
	public void setStudent(Student inputStudent) {
		if(inputStudent != null) {
			student = inputStudent;
		}else {
			student = new Student();
		}
		
	}
	
	public void setCourse(Course inputCourse) {
		if(inputCourse!=null) {
			course = inputCourse;
		}else {
			course = new Course(); 
		}
	}





}
