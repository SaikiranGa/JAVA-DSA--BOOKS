// Q.51
package array;

public class Question_51 {

	public static void main(String[] args) {
		int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int number = arr.length;
		int sum1 = number * (number + 1) / 2; // formula for sum of n numbers.
		int sum2 = 0;

		System.out.print("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum2 = sum2 + arr[i];
		}
		System.out.println("\nMissing Number : " + (sum1 - sum2));
	}

}
