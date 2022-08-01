package test28;

import java.util.Scanner;

public class matrix {
	public static void main(String a[]) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int data[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				// System.out.println();
				data[i][j] = sc.nextInt();
			}
			System.out.println("");
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				// System.out.println();
				 System.out.print(data[i][j]);
			}
			System.out.println("");
		}

		for(int[] r:data) {
			for( int x:r) {
				System.out.println(""+r);
			}				System.out.println();

			
		}
		
		
		
		
	}
}
