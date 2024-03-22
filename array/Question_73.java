//Q.73. sum of all odd number in each array in 2D array. 
package array;

public class Question_73 {
	public static void main(String[] args) {
		int[][] arr = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 0 } };
		
		System.out.println("Sum of odd number in each array in 2D Array.");
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0;j < arr[i].length; j++) {
				if (arr[i][j] % 2 != 0) {
					sum = arr[i][j] + sum; 
				}
			}
			System.out.println("At Index : " + i + " Sum : " + sum + " ");
		}
	}
}
