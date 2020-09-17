package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter dimensions : ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		
		System.out.print("Enter array a : ");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				a[i][j] = sc.nextInt();				
			}
		}
		
		System.out.print("Enter array b : ");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		int c[][] = new int[rows][cols];
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
			 c[i][j] = a[i][1]*b[j][1]  + a[j][1]*b[i][1];
			}
		}
		
		System.out.println("Result array c is : ");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				System.out.print(c[i][j] + " ");			
			}
		}
		System.out.println();
	}
}
