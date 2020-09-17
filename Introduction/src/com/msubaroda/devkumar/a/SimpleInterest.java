package com.msubaroda.devkumar.a;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter prinicple amount: ");
		int p = sc.nextInt();
		
		System.out.print("Enter period of time: ");
		int n = sc.nextInt();
		
		int r = 10;
		for(int i = 1; i < 11; i++) {
			int result = (p*i*n)/100;
			System.out.println("Simple interst for " + i + "% is " + result);
		}
		
		
	}

}
