package oops.packages;

import java.util.*; //For importing all files of java.util

import oops.packages.models.*; //For importing all classes at once

//import oops.packages.models.Student;
//import oops.packages.models.Teacher;

public class MainClass {

	public static void main(String[] args) {
		
		Student obj = new Student("Tom");
		
		obj.name = "Jerry";
		
//		obj.getPassword(); //because getPassword is constrained by private modifiers 
		
		Teacher teacher = new Teacher();
		
		Scanner sc = new Scanner(System.in);
		
	}

}
