package conditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		int dayOfWeek = 3;
//		
//		if(dayOfWeek == 1) {
//			}
//		if(dayOfWeek == 2){
//			}
//		if(dayOfWeek == 3) {
//			}
//		if(dayOfWeek == 4){
//			}
//		if(dayOfWeek == 5) {
//			}
//		if(dayOfWeek == 6){
//			}
//	}
//		switch(dayOfWeek) {
//		case 1:
//			System.out.println("I'm on leave");
//			break;
//		case 2:
//			System.out.println("I'm in office");
//			break;
//		case 3:
//			System.out.println("I'm playing cricket");
//			break;
//			
//			default:
//				System.out.println("I don't know what day it is!!");
//		}
		int rating = 0;
		
		switch(rating) {
		case 1:
		case 2:
			System.out.println("Bad Review");
			break;
		case 3:
			System.out.println("Average Review");
			break;
		case 4:
		case 5:
			System.out.println("Good review");
			break;
			default:
				System.out.println("Rate the product between 1 and 5");
		}
		
	}		
}
	