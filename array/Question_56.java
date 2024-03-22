// Q.56. print index of target element in a given array and change the element value of that index.
package array;

import java.util.Scanner;

public class Question_56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size for array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter values for array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("The Array : ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.print("\nEnter Target : ");
		int target = sc.nextInt();

		System.out.print("Enter Value to Change : ");
		int value = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				arr[i] = value;
			}
		}

		System.out.print("The Array with change Element/Value. : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.print("\nThe Reverse Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
//		int[] arrClone = arr.clone();
		int[] arrClone = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrClone[i] = arr[i];
		}
		
		System.out.print("\nClone of the array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}
