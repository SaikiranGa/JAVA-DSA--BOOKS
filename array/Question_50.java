// Q.50 print display all the prime numbers for the array.
package array;

public class Question_50 {
	public static void main(String[] args) {
		int[] arr = { 7, 12, 4, 356, 4, 75, 147 };

		
		System.out.print("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int number = arr[i];

			for (int j = 1; j <= number; j++) {
				if (number % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.print("\nPrime Numbers in the array : " + arr[i] + " ");
			}

		}
	}
}
