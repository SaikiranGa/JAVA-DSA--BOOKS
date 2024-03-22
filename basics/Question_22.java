// Q.22. Print factorial number in the range.
package basics;

import java.util.Scanner;

public class Question_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Range : ");
		int range = sc.nextInt();

		for (int i = 1; i <= range; i++) {
			int factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial = factorial * j;
			}
			System.out.print(factorial + " ");
		}
		
		sc.close();
	}
}
