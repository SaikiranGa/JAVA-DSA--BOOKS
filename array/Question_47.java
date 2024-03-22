// Q.47. Print even numbers in array.
package array;

import java.util.Scanner;

public class Question_47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array :");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter the Values.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Even Numbers in array : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
			
		}
		
		sc.close();
	}
}
