// Q.37. strong number using factorial of each digit and sum of all factorial digit.
// 145
// 1! + 4! + 5!
// 1 + 24 + 120
// 145
package digits;

import java.util.Scanner;

public class Question_37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		int temp = number;
		int sum = 0;
		while(number != 0) {
			int digit = number % 10;
			digit = factorial(digit);
			sum = sum + digit;
			number = number / 10;
		}
		
		if (temp == sum) {
			System.out.print("Strong Number.");
		} else {
			System.out.print("Not a Strong Number.");
		}
		
		sc.close();
	}
	public static int factorial(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
