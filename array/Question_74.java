//Q.74. Reverse each array in 2d array
package array;

public class Question_74 {
	public static void main(String[] args) {
		int[][] arr = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 0 } };

		System.out.println("Given Array.");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Reverse Array.");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0, r = arr[i].length - 1; j < arr[i].length / 2; j++, r--) {
				arr[i][j] = arr[i][j] + arr[i][r];
				arr[i][r] = arr[i][j] - arr[i][r];
				arr[i][j] = arr[i][j] - arr[i][r];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		int[][] arr1 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		
		System.out.println("Given Array.");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Reverse Array.");
		int[][] arr2 = reverse(arr1);
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

	// rows = array
	// column = elements

	public static int[][] reverse(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0, r = arr[i].length - 1; j < arr[i].length / 2; j++, r--) {
				arr[i][j] = arr[i][j] + arr[i][r];
				arr[i][r] = arr[i][j] - arr[i][r];
				arr[i][j] = arr[i][j] - arr[i][r];
			}
		}
		return arr;
	}
}
