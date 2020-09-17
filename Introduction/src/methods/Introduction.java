package methods;

public class Introduction {

	public static void main(String[] args) {
		
		int firstNumber = 24;
		int secondNumber = 23;
		
		maxOf(3, 100);
		maxOf(100, 3);
		
		
		int result = maxOf(firstNumber, secondNumber); //maxOf is method call
		System.out.println(result);
	
	}

	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		}	else {
				return b;
		}
//		return a > b? a: b; //We can use this also
		
		
			}

	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
	}

}
