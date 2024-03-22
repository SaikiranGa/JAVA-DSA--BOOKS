// Q.31. print the niven or harshad number or not.
package digits;

import java.util.Scanner;

public class Question_31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		int temp = number;
		int sum = 0;
		
		while(number != 0) {
			int digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		
		if (temp % sum == 0) {
			System.out.print("Niven Number.");
		} else {
			System.out.print("Not a Niven Number.");
		}
		
		sc.close();
	}
}
