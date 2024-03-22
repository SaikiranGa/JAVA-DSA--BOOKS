// Q.66
package array;

import java.util.Arrays;

public class Question_66 {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 8, 11, 12 };
		int target = 23;
		System.out.println("Given Array : " + Arrays.toString(arr));
		System.out.println("Target to be Found : " + target);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("Target found at index's : [ " + i + ", " + j + " ]");
					break;
				} 
			}
		}
	}
}
