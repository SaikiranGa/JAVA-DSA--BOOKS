// Q.48. Print sum of all numbers in array.
package array;

import java.util.Scanner;

public class Question_48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("Enter size of the array : ");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter values.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}		
		System.out.print("Sum of all numbers in array : " + sum);
		sc.close();
	}
}