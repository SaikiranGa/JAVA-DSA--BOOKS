// Q.78. 
package array;

import java.util.Scanner;

public class Question_78 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int size = sc.nextInt();

//		int[][] arr = new int[size][size];

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}

		int[][] arr = { { 111, 222, 333 }, { 444, 555, 666 }, { 777, 888, 999 } };
		System.out.println("Given array.");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("Enter Target : ");
		int target = sc.nextInt();
		int sum = 0;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (target == arr[row][col]) {
					sum = row + col;
					break;
				}
			}
		}

		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (sum % 2 ==0 && arr[i][j] % 2 ==0) {
					totalSum = totalSum + sumOfDigit(arr[i][j]);
				} else if (sum % 2 != 0 && arr[i][j] != 0) {
					totalSum = totalSum + sumOfDigit(arr[i][j]);
				}
			}
		}
		System.out.println(totalSum);
		
		sc.close();
	}
	
	public static int sumOfDigit(int n) {
		int sum = 0;
		while(n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		return sum;
	}
}
