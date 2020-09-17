package com.msubaroda.devkumar.a;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		
		String name = "";
		try(Scanner in = new Scanner(System.in)){
			System.out.print("Enter your name: ");
			name = in.nextLine();
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(name);
		}
	}

}
