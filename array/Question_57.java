// Q.57. Reverse element in array without changing its index.
package array;

public class Question_57 {
	public static void main(String[] args) {
		int[] arr = { 12, 34, 56, 78, 901 };

		System.out.print("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\nReverse Array : ");
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int rev = 0;
			while (n != 0) {
				int digit = n % 10;
				rev = rev * 10 + digit;
				n = n / 10;
			}
			arr[i] = rev;
			System.out.print(rev);
			System.out.print(" ");
		}

		System.out.print("\nReverse Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
