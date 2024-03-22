// Q.59. Print the largest number in the array.
package array;

public class Question_59 {
	public static void main(String[] args) {
		int[] arr = { 71, 4, 71, 21, 5, 41, -1, 0 };
//		int large = Integer.MIN_VALUE;

		System.out.print("Given Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		largestNumber(arr);
		smallestNumber(arr);
	}
	
	public static void smallestNumber(int[] arr) {
		int small = arr[0];
		int ssmall = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < small) {
				ssmall = small;
				small = arr[i];
			} else if (arr[i] != small && arr[i] < ssmall) {
				ssmall = arr[i];
			}

		}

		System.out.println("Smallest Number : " + small);
		System.out.println("Second Small Number : " + ssmall);
	}

	public static void largestNumber(int[] arr) {
		int large = arr[0];
		int slarge = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				slarge = large;
				large = arr[i];
			} else if (arr[i] != large && arr[i] > slarge) {
				slarge = arr[i];
			}
		}
		System.out.println("Large Number : " + large);
		System.out.println("Second Large Number : " + slarge);
	}
}
