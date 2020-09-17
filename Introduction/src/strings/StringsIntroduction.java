package strings;

public class StringsIntroduction {

	public static void main(String[] args) {
			
		String name = "Dev";
		String name2 = "Dev Pushkarbhai Patel";
		String anotherName = new String("Dev");
		String name3 = "      Dev      ";
		String cars = "Audi,Mercedes,Pagani,Toyota,Hyundai";
		
//		Splitting the characters
		String allcars[] = cars.split("ud");
		for(String car: allcars) {
			System.out.println(car);
		}
//		To check Index
		System.out.println(cars.indexOf('M'));
		
//		Upper case to Lower case
		System.out.println(cars.toLowerCase());

//		Lower case to Upper case
		System.out.println(cars.toUpperCase());
		
//		Trimming
		System.out.println(name.trim() + "   " + name);
		
//		Both are in pool area
		System.out.println(name == name2);
		
//		One is in heap area and other is in pool area
		System.out.println(name == anotherName);
		
//		function of character Index
		System.out.println(name.charAt(0));
		
//		Length of String
		System.out.println(name2.length());
		
//		Substring with only beginIndex
		System.out.println(name2.substring(4));
		
//		Substring with both Indices
		System.out.println(name2.substring(4,15));
		
//		Contains function
		System.out.println(name2.contains("Pushkar"));
		
//		To check the values using boolean
		System.out.println(name.equals(anotherName));
		
//		To check the contain of the string
		System.out.println(name.isEmpty());
		
//		Concatation to append a string to another
		System.out.println(name.concat(" is a good boy"));
		
//		To replace characters
		System.out.println(name2.replace("a", "d"));
		

	}

}
