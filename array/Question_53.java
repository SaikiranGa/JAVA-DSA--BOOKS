// Q.53. reverse an actual array.
package array;

import java.util.Scanner;

public class Question_53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

//		int[] arrClone = arr.clone();
		int[] arrClone = new int[arr.length];
		
		for (int i = 0; i < arrClone.length; i++) {
			arrClone[i] = arr[i];
		}
		
		System.out.print("The Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		System.out.print("\nReverse Of Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\nClone Array : ");
		for (int i = 0; i < arrClone.length; i++) {
			System.out.print(arrClone[i] + " ");
		}
		
		for (int i = 0, j = arrClone.length - 1; i < arrClone.length / 2; i++, j--) {
			arrClone[i] = arrClone[i] + arrClone[j];
			arrClone[j] = arrClone[i] - arrClone[j];
			arrClone[i] = arrClone[i] - arrClone[j];
		}

		System.out.print("\nReverse of Clone Array : ");
		for (int i = 0; i < arrClone.length; i++) {
			System.out.print(arrClone[i] + " ");
		}
		
		sc.close();
	}
}
