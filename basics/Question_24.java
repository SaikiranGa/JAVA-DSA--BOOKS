// Q.26. Find lcm of two number.
package basics;

import java.util.Scanner;

public class Question_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ** LCD - Least Common Denominator ** ");
		System.out.println(" ** LCM - Least Common Multiple ** ");
		
		System.out.print("Enter 1st Number : ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter 2nd Number : ");
		int number2 = sc.nextInt();
		
		int GCD = 1;
		
		for (int i = 1; i <= number1 && i<=number2; i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				GCD = i;
			}
		}
		
		int LCD = (number1 * number2) / GCD;
		
		System.out.println("LCD or LCM is : " + LCD);
		
		sc.close();
	}
}
