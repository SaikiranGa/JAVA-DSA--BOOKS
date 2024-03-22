// Q.88
package array;

import java.util.Scanner;

public class Question_88 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		
		System.out.print("Enter k'th number : ");
		int k = sc.nextInt();
		
		System.out.println("Enter array elements.");
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 1; i < k; i++) {
			int maxEle = 0;
			for (int m = 0; m < arr.length; m++) {
				maxEle = Math.max(maxEle, arr[m]);
			}
			for (int j = 0; j < arr.length; j++) {
				arr[j] = maxEle - arr[j];
			}
		}
		
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
