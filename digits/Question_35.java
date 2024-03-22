// Q.35. check if the number is a perfect square.
package digits;

import java.util.Scanner;

public class Question_35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		int i = 1;

		sc.close();

		for (; i <= number; i++) {
			if (i * i == number) {
				System.out.println("Perfect Number.");
				break;
			}
		}
		if (i * i > number) {
			System.out.println("Not a Perfect Number.");
		}
	}
}
