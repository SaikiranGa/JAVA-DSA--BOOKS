// Q.45. any into any
package digits;

import java.util.Scanner;

public class Question_45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Octal Number : ");
		int number = sc.nextInt();
		
		String result = "";
		int sum = 0, power = 1, base = 8;
		
		while(number != 0) {
			int digit = number % 10;
			sum = sum + digit * power;
			number = number / 10;
			power = power * base;
		}
		
		System.out.println("Decimal Number : " + sum);

		while(sum != 0) {
			int rem = sum % 2;
			result = rem + result;
			sum = sum / 2;
		}
		
		System.out.println("Binary Number : " + result);
		
		sc.close();
	}
}
