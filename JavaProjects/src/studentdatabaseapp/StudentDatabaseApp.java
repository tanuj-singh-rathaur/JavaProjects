package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
				
		// Asking number of Students
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Students");
		int totalStudents=sc.nextInt();
		
		//Creating number of students	
		Student[] students=new Student[totalStudents];
		for(int i=0;i<totalStudents;i++) {
			
			students[i]=new Student();
			students[i].enroll();
			students[i].balancePay();
			System.out.println(students[i].toString());	
		}
	}
	
}
