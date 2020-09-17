package com.msubaroda.devkumar.a;

import java.util.*;

public class SwappingTwoNumbers {

	public static void main(String[] args) {

		

		
		        int a,b;
		  
		        Scanner sc=new Scanner(System.in);

		        System.out.print("Enter value of a: ");
		        a=sc.nextInt();
		        System.out.print("Enter value of b: ");
		        b=sc.nextInt();

		        System.out.println("Before swapping - a: "+ a +", b: " + b);
		        
		        int temp;
		        temp=a;
		        a=b;
		        b=temp;
		    
		        System.out.println("After swapping  - a: "+ a +", b: " + b);
		    }
	}


