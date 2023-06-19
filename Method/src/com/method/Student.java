package com.method;

public class Student {

	int id ;
	String name;
	int marks;
	
	public void display() {
		System.out.println("the display method is run...");
	}
	
	public void addition(int x, int y) {
		System.out.println("addition is "+(x+y));
	}
	
	public int get_data() {
		int age=23;
		System.out.println(age);
		return age;
	}
	
	public double area_of_circle(double pi, int r) {
		
		double area =pi*r*r;
		System.out.println(area);
		return area;
	}

	public static void main(String[] args) {
		
			Student s = new Student();
			s.display();
			s.addition(10, 5);
			s.area_of_circle(3.14, 3);
			s.get_data();

	}

}
