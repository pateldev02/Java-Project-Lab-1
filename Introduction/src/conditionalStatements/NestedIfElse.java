package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		int a = 12;
		int b = 8;
		int c = 100;
		
		int result = 0;
		
//		if(a>b) {
//			if(a>c) {
//				result = a;
//			}
//			else {
//				result = c;	
//		}
//		}else {
//			if(b>c) {
//				result = b;
//			}
//			else {
//				result = c;
//			}
//		}
//		System.out.println("Largest of the three number is :" + result);
//	}

	result = a>b? a>c ? a : c : b>c ? b : c;
	System.out.println("Largest of the three number is :" + result);
	}
    
}
