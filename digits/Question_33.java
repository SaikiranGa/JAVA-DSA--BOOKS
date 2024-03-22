// Q.33. print all the digits of a number which are prime.
package digits;

import java.util.Scanner;

public class Question_33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		String result = "";
		
		System.out.print("Prime Number : ");
		while(number != 0) {
			int digit = number % 10;
			if (isPrime(digit)) {
				result = digit + " " + result;
			}
			number = number / 10;
		}
		
		System.out.print(result);
		sc.close();
	}
	
	public static boolean isPrime(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		return count == 2;
	}
}
