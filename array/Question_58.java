// Q.58 print all the palindrome numbers in the array.
package array;

public class Question_58 {
	public static void main(String[] args) {
		int[] arr = { 45, 11, 27, 88, 64, 121, 111 };

		System.out.print("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\nPalindrome numbers : ");
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int rev = 0;
			while (n != 0) {
				int digit = n % 10;
				rev = rev * 10 + digit;
				n = n / 10;
			}

//			arr[i] = rev;
			if (arr[i] == rev) {
				System.out.print(rev + " ");
			}
		}
	}
}
