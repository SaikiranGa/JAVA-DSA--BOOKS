package array;
import java.util.Scanner;

public class Question_69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Outer Array Size : ");
		int outer_size = sc.nextInt();

		System.out.print("Enter Inner Array Size : ");
		int inner_size = sc.nextInt();

		int[][] arr = new int[outer_size][inner_size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter Element At Index [ " + i + ", " + j + " ] : ");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print("Odd Numbers In 2D Array : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 != 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		
		sc.close();
	}
}
