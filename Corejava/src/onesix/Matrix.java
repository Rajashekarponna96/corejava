package onesix;

import java.util.Arrays;

public class Matrix {
	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				System.out.print(matrix[i][j]);
//			}
//			System.out.println("");
//		}
//for each
//		for (int r[] : matrix) {
//			for (int l : r) {
//				System.out.print(l);
//			}
//
//			System.out.println("");
//		}

		Integer num = 123;
		Arrays.stream(matrix).forEach((i) -> {
			Arrays.stream(i).forEach((j) -> System.out.print(j));
			System.out.println();
		});
		
		
		// System.out.println(Arrays.toString(matrix));

		// System.out.println(Arrays.deepToString(matrix));

	}

	int row;
	int col;

	int r[][] = new int[row][col];

}
