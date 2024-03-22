// Q.63. 
package array;

import java.util.Scanner;

public class Question_63 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		int avg = sum / size;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == avg) {
				count++;
			}
		}

		System.out.println("element " + avg + " present in array " + count + " times. ");
		sc.close();
	}
}
