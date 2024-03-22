// Q.111
package string;

import java.util.Arrays;

public class Question_111 {
	public static void main(String[] args) {
		String str = "ponml";
		String rev = "";

		int[] arr = new int[str.length() - 1];
		int[] arr1 = new int[str.length() - 1];

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		for (int i = 0, j = i + 1; i < arr.length; i++, j++) {
			arr[i] = Math.abs(str.charAt(i) - str.charAt(j));
			arr1[i] = Math.abs(rev.charAt(i) - rev.charAt(j));
		}
		
		if (Arrays.equals(arr, arr1)) {
			System.out.println("Funny.");
		} else {
			System.out.println("Not a funny.");
		}
	}
}
