// Q.52. Print reverse of an array.
package array;

import java.util.Scanner;

public class Question_52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter values : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("The Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\nReverse Array : ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
