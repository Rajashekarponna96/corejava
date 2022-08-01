package Logics;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixDemo {
	

	public static void main(String[] args) {
//		System.out.println("ente roes no");
//		Scanner sc = new Scanner(System.in);
//		int rows = sc.nextInt();
//		// Scanner sc=new Scanner (System.in);
//		System.out.println("ente roes no");
//		int cols = sc.nextInt();
//
//		// here 2 d array
//		int data[][] = new int[rows][cols];
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < rows; j++) {
//				// System.out.println();
//				data[i][j] = sc.nextInt();
//
//			}
//			System.out.print("");
//		}

//printing
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				System.out.print(data[i][j] + " ");
//
//			}
//			System.out.println(" ");
//		}
//for each 
//		for (int[] r : data) {
//			
//			for (int x : r) {
//
//				System.out.print(x + " ");
//			}
//			System.out.println();
//		}

		// single forloop
//		for(int [] r:data) {
//			System.out.println(Arrays.toString(r));
//			
//		}
		// System.out.println(Arrays.deepToString(data));

//		
		int [][]matrix= {
				
				
				{1 ,2 , 3},
				{1 , 2, 3},
				{1 , 2, 3}
		};
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
			}System.out.println(" ");
		}
		
		
		
		
		String name = "12";
		String name1 = "12";
		
		String name11 = new String();
		
 		 System.out.println(Arrays.deepToString(matrix)+"\n");
 		 System.out.print(Arrays.deepToString(matrix));

		Arrays.stream(matrix).forEach((e) -> {
			Arrays.stream(e).forEach((j) -> System.out.print(j + " "));
			System.out.println();
		});

	}

}
