// Q.5. The range to find sum of total range?
package basics;

import java.util.Scanner;

public class Question_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Rang : ");
		int range = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= range; i++) {
			sum = sum + i; // or sum = range * (range + 1) / 2;
		}
		System.out.println("Sum : " + sum);

		sc.close();
	}
}
