// Q.64 
package array;

import java.util.Arrays;

public class Question_64 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
		int maxDiff = 0;
		System.out.println("Given Array : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] > maxDiff) {
					maxDiff = arr[j] - arr[i];
				}
			}
		}
		System.out.println("Max Difference is : " + maxDiff);
	}
}
