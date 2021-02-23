package studentdatabaseapp;

import java.util.Scanner;

public class Student {
 
	private  String first_name;
	private String last_name;
	private int gradeyear;
	private static int id=1000;
	private int costOfCourse=600;
	private int studentId;
	private String courses="";
	private int tuitionBalance=0;
	
	//Constructor  : prompt users the name and the grade year 
	public Student() {
		Scanner sc =new Scanner(System.in);
		System.out.print("\nEnter first name");
		this.first_name=sc.nextLine();
		System.out.print("\nEnter last name");
		this.last_name=sc.nextLine();
		System.out.println("\n1 for Freshman\n2 for Sophmore\n3 for Junior\n4 for Senior");
		System.out.print("\nEnter grade year");
		this.gradeyear=sc.nextInt();
		this.studentId=Integer.parseInt(createUniqueId());
				
	}
	//create random 5 digit unique id
	private String createUniqueId() {
		id++;
		return gradeyear+""+id;
	}
	
	//enroll for the courses
	public void enroll() {
		do {
			
			System.out.println("\nEnter courses to enroll (Q to exit)");
			Scanner sc=new Scanner(System.in);
			String course =sc.nextLine();
			if(course.equals("q"))
				break;
			else {
				courses=courses+"\n"+course;
				tuitionBalance+=costOfCourse;
			}
			
		}while(true);
		System.out.println(getBalance());
		
	}
	
	//view balance 
	public String getBalance() {return "Current Balance is: "+tuitionBalance;}
	
	// pay tuition balance
	public void balancePay() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be paid");
		int payment =sc.nextInt();
		this.tuitionBalance=this.tuitionBalance-payment;
		System.out.println("Thanks for paying "+payment+"\n Your"+getBalance());
	}
	//show info name,id,courses enrolled and balance
	public String  toString() {
		return "\nDetails of the student\n"+first_name+" "+last_name+" "+gradeyear+" "+studentId+"\nCourses Enrolled: "+courses+"\n"+getBalance();
	}
	
	
	
}
