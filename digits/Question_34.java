// Q.34. check if the number is a special number.
package digits;

import java.util.Scanner;

public class Question_34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		
		int temp = number;
		int sum = 0;
		int product = 1;
		
		while(number != 0) {
			int digit = number % 10;
			sum = sum + digit;
			product = product * digit;
			number = number / 10;
		}
		
		int addition = sum + product;
		
		if (temp == addition) {
			System.out.println("Special Number.");
		} else {
			System.out.println("Not a Special Number.");
		}
		
		sc.close();
	}
}
