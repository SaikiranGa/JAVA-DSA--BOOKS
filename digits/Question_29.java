// Q.29. print the product of all the digit in the number;
package digits;

import java.util.Scanner;

public class Question_29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		int product = 1;
		
		while(number != 0) {
			int digit = number % 10;
			product = product * digit;
			number = number / 10;
		}
		
		System.out.println("Product of all the digit in the number : " + product);
		
		sc.close();
	}
}
