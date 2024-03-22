//Q.89.
package array;

import java.util.Scanner;

public class Question_89 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		
		int[][] arr = new int[size][size];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int suml = 0, sumr = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					suml = suml + arr[i][j];
				}
				if (i + j == size -1) {
					sumr = sumr + arr[i][j];
				}
			}
		}
		
		System.out.println(abs(suml - sumr));
		
		sc.close();
	}
	public static int abs(int n) {
		return n < 0 ? n * -1 : n;
	}
}
