// Q.77. Matrix Multiplication
package array;

public class Question_77 {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr2 = { { 3, 1, 0 }, { 1, 3, 1 }, { 2, 1, 0 } };
		int[][] res = new int[arr1.length][arr1.length];

		for (int row = 0; row < res.length; row++) {
			for (int col = 0; col < res[row].length; col++) {
				int sum = 0;
				for (int ele = 0; ele < res.length; ele++) {
					sum = sum + arr1[row][ele] * arr2[ele][col];
				}
				res[row][col] = sum;
			}
		}

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
}
