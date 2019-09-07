package com.ritroorkee;

public class UniversityDemo {

	public static void main(String[] args) {

		University u = new University();
		Department cse= new Department("CSE", 1);
		u.addDepartment(cse);
		Department mca=new Department("MCA",2);
		u.addDepartment(mca);
		Student s= new Student("Arjun",1);
		cse.addStudent(s);
		Student s2=new Student("Aman",2);
		cse.addStudent(s2);
		Student s3=new Student("Santosh",3);
		mca.addStudent(s3);
		 
		
		
		
		
		
		u.declareResult();
	}
}
      