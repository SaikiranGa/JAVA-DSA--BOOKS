// Q.15. Write a program to print all the perfect number in the range.
package basics;

import java.util.Scanner;

public class Question_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Range : ");
		int range = sc.nextInt();

		for (int i = 1; i <= range; i++) {

			int sum = 0;
			
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == 0) {
				System.out.println("All Perfect Numbers in Your Range : " + range);
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}
}
