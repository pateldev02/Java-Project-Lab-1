package collegeProgramsCN;
import java.io.*;
import java.util.*;

public class ParityCheck {
	
	String A = new String();
	String B = new String();
	
	int i, opt, len;
	int num1, num0;
	
	void getDataSender() throws IOException{
		System.out.println("Enter data in Binary terms: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //For inputting and reading default size
		A = br.readLine();
		len = A.length();
		for(i = 0; i<A.length(); i++) {
			if(A.charAt(i)!='1' && A.charAt(i)!= '0'){
				System.out.println("Enter Values in binary digit: ");
				return;
				
			}
		}
		System.out.println("Enter even or 2 for odd");
		try (Scanner s = new  Scanner(System.in)) {
			opt = s.nextInt();
		}
		if(opt==1) {
			System.out.println("This is even parity");
		
		}
		else {
			System.out.println("This is odd parity");
			
		}
		System.out.println();
		}
		void even() throws IOException{
			num1 = num0 = 0;
			for(i=0;i<B.length();i++) {
				if(B.charAt(i) == '1') {
					num1++;
					
				}
				if(B.charAt(i)=='0') {
					num0++;
					}
			}
			
			if(num1%2!=0){
					B=B+'0';
					System.out.println("odd parity:");
					for(i=0;i<B.length();i++){
						System.out.print(B.charAt(i));
				}
				}
			else{
				B=B+'1';
					System.out.println("odd parity:");
					for(i=0;i<B.length();i++){
						System.out.print(B.charAt(i));
				}
			}
				}
			void getDataReciver()throws IOException{
				
				System.out.println("EnterBinary data:");
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
						A=br.readLine();
						len+=1;
				if(len!=A.length()){
						System.out.println("EnterBinary data of length: "+len);
						return;
				}
				for(i=0;i<A.length();i++){
					if(A.charAt(i)!='1' && A.charAt(i)!='0'){
						System.out.println("Enter binary values");
						return;
				}
				}
				num1=num0=0;
				for(i=0;i<A.length();i++){
				if(A.charAt(i)=='1'){
				num1++;
				}
				if(A.charAt(i)=='0'){
				num0++;
				}
				}
				if(opt==1){
				if(num1%2==0){
				System.out.println("Dataived successfully");

				}
		}
}
}