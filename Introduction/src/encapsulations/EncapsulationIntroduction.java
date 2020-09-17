package encapsulations;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		
		Student obj = new Student();

//		obj.age = 16;
//		obj.name = "Tom";
		
		
		obj.setAge(15); 
		System.out.println(obj.getAge());
		
	}

}
