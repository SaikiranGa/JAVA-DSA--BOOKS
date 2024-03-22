// Q.61. Insertion sort 
package array;

import java.util.Arrays;

public class Question_62 {
	public static void main(String[] args) {
		int[] arr = { 32, 1, 4, 5, 0, 89 };

		System.out.println("Given Array : " + Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}

		System.out.println("Array after insertion sort. : " + Arrays.toString(arr));
	}
}
