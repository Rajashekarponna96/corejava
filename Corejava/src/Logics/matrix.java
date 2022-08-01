package Logics;

import java.util.Arrays;
import java.util.Scanner;

public class matrix {
	public static void main(String[] args) {
		System.out.println("ente roes no");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		// Scanner sc=new Scanner (System.in);
		System.out.println("ente roes no");
		int cols = sc.nextInt();

		// here 2 d array
		int data[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				// System.out.println();
				data[i][j] = sc.nextInt();

			}
			System.out.print("");
		}

//printing
//	for (int i = 0; i < rows; i++) {
//		for (int j = 0; j < cols; j++) {
//			System.out.print(data[i][j] + " ");
//
//		}
//		System.out.println(" ");
//	}
//for each 
//	for (int[] r : data) {
//		
//		for (int x : r) {
//
//			System.out.print(x + " ");
//		}
//		System.out.println();
//	}

		// single forloop
//	for(int [] r:data) {
//		System.out.println(Arrays.toString(r));
//		
//	}
		// System.out.println(Arrays.deepToString(data));

//	

		Arrays.stream(data).forEach((e) -> {
			Arrays.stream(e).forEach((j) -> System.out.println(j + " "));
			System.out.println();

		});

	}
}
