// Q.65. 
package array;

import java.util.Arrays;

public class Question_65 {
	public static void main(String[] args) {
		int[] arr = {7,2,4,6,8};
		int k = 7; 
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (k == arr[i]) {
				index = i;
				break;
			}
		}
		System.out.println("Given Array : " + Arrays.toString(arr));
		System.out.println("Value to find (k) : " + k);
		System.out.println("Value found at Index : " + index);
	}
}
