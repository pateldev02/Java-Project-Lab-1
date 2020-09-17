package com.msubaroda.devkumar.a;

import java.io.*; 

public class UserInput {
			static boolean isNumber(String s) { 
				for (int i = 0; i < s.length(); i++) 
				if (Character.isDigit(s.charAt(i)) 
					== false) 
					return false; 

				return true; 
			} 
			public static void main(String[] args) {
				String str = "21"; 
 
				if (isNumber(str)) { 
					System.out.println("Integer");  
				}
					else
					System.out.println("String"); 
				
			 
		} 
	}

