package com.msubaroda.devkumar.a;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int factorial = 1;
		
		for(int i = n; i>=1; i--) {
			factorial = factorial*i;
		}
		System.out.println("Facotrial of your number is "+ factorial);
	}

}
