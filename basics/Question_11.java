// Q.11. Find sum of all odd numbers in user input range.
package basics;

import java.util.Scanner;

public class Question_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= range; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		
		System.out.println("Sum of all odd numbers : " + sum);
		
		sc.close();
	}
}
