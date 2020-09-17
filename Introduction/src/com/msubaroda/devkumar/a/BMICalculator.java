package com.msubaroda.devkumar.a;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter your weight(in pound): ");
		double weight = sc.nextInt();
		
		System.out.print("Enter your heigth(in inch): ");
		double height = sc.nextInt();
		
		double result = (weight * 703) / (height*height);
			System.out.println("Your BMI is: " + result);
		
			System.out.println("--Your weight status--");
		if(result<=18.5) {
			System.out.println("You are underweight.");
		}
		if(result>=18.5 && result<=24.9) {
			System.out.println("You are normal. ");
		}
		if(result>=25.0 && result<=29.9) {
			System.out.println("You are overweight. ");
		}	
		if(result>=30) {
			System.out.println("You are obese. ");
			}
		else {
			System.out.println();
		}
		}
	}



