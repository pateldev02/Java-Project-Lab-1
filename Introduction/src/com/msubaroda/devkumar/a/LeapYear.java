package com.msubaroda.devkumar.a;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int i = sc.nextInt();
		
		if(i % 4 == 0) {
			System.out.println("It is a leap year.");
			}
		else {
			System.out.println("Not a leap year.");
		}
		
	}

}
