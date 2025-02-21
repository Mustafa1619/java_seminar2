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
		
		
		Course c1 = new Course();
		System.out.println(c1);
		
		Course c2 = new Course("JAVA Programming", 6, p2);
		System.out.println(c2);
		
		Course c3 = new Course("6456384654135416dsfseada64354135854", -4, null);
		System.out.println(c3);
		
		allCourses.addAll(Arrays.asList(c1,c2,c3));
		
		Grade g1 = new Grade();
		System.out.println(g1);
		
		Grade g2 = new Grade(3, st2, c2); 
		allGrades.addAll(Arrays.asList(g1, g2));
	}

}
