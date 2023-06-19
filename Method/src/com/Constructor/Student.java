package com.Constructor;

public class Student {
	
	int sid;
	String sname;
	int marks1;
	int marks2;
	int marks3;
	float percentage;
	
	public void acceptDetails() {
		
		sid=101;
		sname="suraj";
		marks1=65;
		marks2=89;
		marks3=76;
		
	}
	
	public void calculatePersentage() {
		
		percentage=(marks1+marks2+marks3/3);
		
	}
	
	public void displayAllDetails() {
		
		System.out.println(sid+" "+sname+" "+marks1+" "+marks2+" "+marks3+" "+percentage);
		
	}
	

	public static void main(String[] args) {
		
		Student s = new Student();
		s.acceptDetails();
		s.calculatePersentage();
		s.displayAllDetails();
		

	}

}
