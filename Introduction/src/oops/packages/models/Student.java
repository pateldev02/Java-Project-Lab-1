package oops.packages.models;

public class Student {

	public String name;
	
	public Student (String Name) {
		this.name = name;
	}
	
	public String getName() {
		getPassword(); //We can access getPassword because they are in same class
		return name;
	}
	
	private String getPassword() {
		return "lfjdbkwuefjk@iyebr21";
	}
	
}
