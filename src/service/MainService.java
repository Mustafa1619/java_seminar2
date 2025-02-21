package service;

import model.Degree;
import model.Grade;
import model.Professor;
import model.Student;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
public class MainService {

	
	private static ArrayList<Student> allStudents = new ArrayList<Student>();
	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Course> allCourses= new ArrayList<Course>();
	private static ArrayList<Grade> allGrades= new ArrayList<Grade>();
	
	public static void main(String[] args) {
		
		Student st1 = new Student();
		System.out.println(st1.toString());
		
		Student st2 = new Student("John","Green");
		System.out.println(st2);
		
		Student st3 = new Student("43567","8654132");
		System.out.println(st3);
		
		Student st4 = new Student(null, null);
		System.out.println(st4);
		
		allStudents.addAll(Arrays.asList(st1, st2, st3, st4));
		System.out.println(allStudents);
		
		
		
		Professor p1 = new Professor();
		System.out.println(p1);
		
		Professor p2 = new Professor("Karina","Skirmante", Degree.dr);
		System.out.println(p2);
		
		allProfessors.addAll(Arrays.asList(p1,p2));
		//System.out.println(allProfessors);
		try {
			createProfessor("Estere", "Vitola", Degree.mg);
			createProfessor("Karlis", "Immers", Degree.mg);
			
			System.out.println("Retrieve example: " + retrieveProfessorByID(10001));
			
			System.out.println(allProfessors);
			updateProfessorByID(10000, "Vairis", "Caune", Degree.dr);
		}catch( Exception exception) {
			System.out.println(exception);
		}
		
		
		Course c1 = new Course();
		System.out.println(c1);
		
		Course c2 = new Course("JAVA Programming", 6, p2);
		System.out.println(c2);
		
		Course c3 = new Course("6456384654135416dsfseada64354135854", -4, null);
		System.out.println(c3);
		
		allCourses.addAll(Arrays.asList(c1,c2,c3));
		System.out.println(allCourses);
		
		Grade g1 = new Grade();
		System.out.println(g1);
		
		Grade g2 = new Grade(3, st2, c2); 
		allGrades.addAll(Arrays.asList(g1, g2));
		System.out.println(allGrades);
	}

	public static void createProfessor(String name, String surname, Degree degree) throws Exception  {
		if(name ==null||surname==null||degree == null) {
			throw new Exception("Input params can not be null");
		}
		
		for(Professor tempP : allProfessors) {
			
			if(tempP.getName().equals(name) && tempP.getSurname().equals(surname) && tempP.getDegree().equals(degree)){
				throw new Exception("This professor is already registered");
			}
		}
	}
	
	public static Professor retrieveProfessorByID(long id) throws Exception {
		if(id<10000) {
			throw new Exception("Id should be positive and larger than 9999");
		}
		
		for(Professor tempP : allProfessors) {
			if(tempP.getpId()==id) {
				return tempP;
			}
		}
			
		throw new Exception("Professor is not found");
		
		
	}
	
	public static void updateProfessorByID(long id,String name, String surname, Degree degree) throws Exception{
		Professor tempP = retrieveProfessorByID(id);
		if(name!= null && !tempP.getName().equals(name)) {
			tempP.setName(name);
		}
		
		if(surname!= null && !tempP.getSurname().equals(surname)) {
			tempP.setSurname(surname);
		}
		
		if(degree!= null && !tempP.getDegree().equals(degree)) {
			tempP.setDegree(degree);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
