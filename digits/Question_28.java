// Q.28. print the sum of all the digit in the number;
package digits;

import java.util.Scanner;

public class Question_28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		int sum = 0;
		
		while(number != 0) {
			int digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		
		System.out.println("Sum of all the digit in the number : " + sum);
		
		sc.close();
	}
}
