package com.Constructor;

public class Course {

	
	int courseId;
	String courseName;
	SubCourse subCourse;
	
	public Course() {
		System.out.println("Course object created..");
		subCourse = new SubCourse();
	}
	
	public Course(int courseId,String courseName,SubCourse subCourse) {
		this.courseId=courseId;
		this.courseName =courseName;
		this.subCourse=subCourse;
	}
	public static void main(String[] args) {
		
		Course c = new Course();
		//Course c2 = new Course();
		System.out.println(c.courseId+" "+c.courseName);
		System.out.println("subCourse Id is "+c.subCourse.getSubCourseId());
		System.out.println("subCourse Name is"+" "+c.subCourse.getSubcourseName());

}


public class SubCourse{
	int subCourseId;
	String subCourseName;
	 
	
	public SubCourse() {
		System.out.println("subcourse object created");
		subCourseId=1;
		subCourseName="java";
		
		}
		public int getSubCourseId() {
		return subCourseId;
		
	}
		
		public String getSubcourseName() {
			return subCourseName;
		}
}

}