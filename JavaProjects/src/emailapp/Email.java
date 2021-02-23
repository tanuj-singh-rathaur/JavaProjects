package emailapp;

import java.util.Scanner;

public class Email {

	private String first_name;
	private String last_name;
	private String department;
	private String password;
	private String email;
	private String companySuffix="mycompany";
	private int mailboxCapacity=500;
	private String alternateEmail;

	public Email(String first_name,String last_name) {
		this.first_name=first_name;
		this.last_name=last_name;
		this.department=this.getDepartment();
		this.password=this.getRandomPassword(10);
		this.email=this.first_name.toLowerCase()+"."+last_name.toLowerCase()+"@"+this.department+"."+companySuffix+".com";
		
	}
	
  public String getRandomPassword(int passlength) {
	  String validValues="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdehfghijklmnopqrstuvwxyz1234567890!@#$%";
	  char str[]=new char[passlength];
	  
	  for(int i=0;i<passlength;i++) {
		  int rand=(int) (Math.random()*validValues.length());
		  str[i]=validValues.charAt(rand);
	  }
	  return new String(str);
  }
	
	public String getDepartment() {
        Scanner sc=new Scanner(System.in);
		int dept;		
		System.out.println("Enter your Department\n 0 for Sales\n 1 for Development\n 2 for Accounting");
	    dept=sc.nextInt();
	    sc.close();
	    if(dept==0) return "Sales";
	    else if(dept==1) return "Development";
	    else if(dept==2) return "Accounting";
	    else return "";
	    
	    
	}
	public String getInfo() {
		return "Name Of The Employee: "+first_name+" "+last_name+"\ndepartment: "+department+"\nPassword: "+password+"\nEmail: "+email;
	}
	
	public void setMailboxCapacity(int capacity) {this.mailboxCapacity=capacity;}
	public void setAlternateEmail(String alternameEmail) {this.alternateEmail=alternameEmail;}
	public void setPassword(String password) {this.password=password;}
	
	public String getName() {return this.first_name+" "+last_name;}
	public String getEmail() {return this.email;}
	public int getMailboxCapacity() {return this.mailboxCapacity;}
}
