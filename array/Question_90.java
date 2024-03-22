//Q.90.
package array;

import java.util.Arrays;
import java.util.Scanner;

public class Question_90 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter k'th number : ");
		int k = sc.nextInt();
		int[] arr1 = new int[k];
		int[] arr2 = new int[size - k];
		for (int i = 0; i < k; i++) {
			arr1[i] = arr[i];
		}
		for (int i = k; i < size; i++) {
			arr2[i - k] = arr[i];
		}

		Arrays.sort(arr1, 0, k);
		Arrays.sort(arr2, 0, size - k);

		int len2 = size - k;
		for (int i = 0; i < size; i++) {
			if (i < k) {
				arr[i] = arr1[i];
			} else {
				arr[i] = arr2[len2 - 1];
				len2--;
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
