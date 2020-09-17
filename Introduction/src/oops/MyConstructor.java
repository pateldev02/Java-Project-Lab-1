package oops;

class Vehicle{
	int wheels;
	int headLights;
	String color;
	
	Vehicle(){
		
}
	
	Vehicle(int noOfWheels){
		wheels = noOfWheels; //When constructor is parameterized
//		this.wheels = wheels; //For This keyword
		headLights = 2;
	}
	
	Vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
		headLights = 2;
	}
	
}

public class MyConstructor {
	
	MyConstructor(){
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		
		MyConstructor obj = new MyConstructor(); //MyConstructor() is method calling
		
		Vehicle car = new Vehicle(4);
		
		Vehicle bike = new Vehicle(2);
		
		Vehicle eRickshaw = new Vehicle(3, "Yellow");
		
//		Vehicle random = new Vehicle(); // Compile time error will pop-up because we have manually constructed constructors. We have to declare a default constructor.
		
		System.out.println(eRickshaw.wheels + " wheels and color is " + eRickshaw.color);  //car.wheels is an object
	}

}
