package service;

import model.Student;

public class MainService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		System.out.println(st1.toString());
		
		Student st2 = new Student("John","Green");
		System.out.println(st2);
		
		Student st3 = new Student("43567","8654132");
		System.out.println(st3);
		
		Student st4 = new Student(null, null);
		System.out.println(st4);
		
	}

}
