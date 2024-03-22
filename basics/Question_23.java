// Q.23.. Find GCD of two numbers.
package basics;

import java.util.Scanner;

public class Question_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ** GCD - Greatest Common Divisor ** ");
		System.out.println(" ** HCF - Highest Common Factor ** ");
		
		System.out.print("Enter 1st Number : ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter 2nd Number : ");
		int number2 = sc.nextInt();
		
		int GCD = 1;
		
		for (int i = 1; i <= number1 && i <= number2; i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				GCD = i;
			}
		}
		
		System.out.println("GCD is : " + GCD);
		
		sc.close();
	}
}
