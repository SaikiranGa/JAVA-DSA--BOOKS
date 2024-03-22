// Q.49. print the number from the array which has maximum 1's in its binary equivalent.
package array;

public class Question_49 {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 7, 9, 6 };
		int maxCount = 0;
		int max = 0;
		String b = "";
		System.out.print("Given array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			int number = arr[i];
			int count = 0;
			String res = "";
			while (number != 0) {
				int rem = number % 2;
				if (rem == 1) {
					count++;
				}
				res = rem + res;
				number = number / 2;
			}
			if (maxCount < count) {
				maxCount = count;
				max = arr[i];
				b = res;
			}
		}
		System.out.println("\nMax binary values of " + max + " number is " + b);

	}
}
