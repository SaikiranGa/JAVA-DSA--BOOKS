// Q.21. Factorial of numbers.
package basics;

import java.util.Scanner;

public class Question_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		double number = sc.nextInt();
		
		double factorial = 1;
		
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of "+ (int)number +"th Number : " + factorial);
		
		sc.close();
	}
}
