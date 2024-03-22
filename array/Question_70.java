package array;
import java.util.Scanner;

public class Question_70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Outer Array Size : ");
		int outer_size = sc.nextInt();

		System.out.print("Enter Inner Array Size : ");
		int inner_size = sc.nextInt();
		System.out.println("=====================================");
		int[][] arr = new int[outer_size][inner_size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter Element At Index [ " + i + ", " + j + " ] : ");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("=====================================");
		System.out.println("Given 2D Array.");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("|\n");
		}

		System.out.println("=====================================");
		System.out.println("Sum of Number in 2D Array.");
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = arr[i][j] + sum;
			}
			System.out.println("At Index [ " + i + " ] sum : " + sum);
		}
		
		sc.close();
	}
}
