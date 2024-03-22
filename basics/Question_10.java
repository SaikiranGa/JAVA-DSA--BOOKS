// Q.10. Find sum of all even numbers in user input range.
package basics;

import java.util.Scanner;

public class Question_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= range; i++) {
			if (range % i == 0) {
				sum = sum + i;
			}
		}
		
		System.out.println("Sum Of All Even Numbers : " + sum);
		
		sc.close();
	}
}
