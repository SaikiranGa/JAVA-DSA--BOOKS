// Q.55. print index of target element in a given array.
package array;

import java.util.Scanner;

public class Question_55 {
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
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\nEnter Target : ");
		int target = sc.nextInt();

		int index = 0;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				index = i;
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("Target found in array at index : " + index);
		} else {
			System.out.println("Target not found in array.");
		}

		sc.close();
	}
}
