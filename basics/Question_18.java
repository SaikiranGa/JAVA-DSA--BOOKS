// *Q.18. Swap two numbers.
package basics;

import java.util.Scanner;

public class Question_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number (a) : ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter 2nd Number (b) : ");
		int number2 = sc.nextInt();
		
		System.out.println("Before Swapping :: a = " + number1 + ", b = " + number2);
		
		int temp;
		
		temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("After Swapping :: a = " + number1 + ", b = " + number2);
		
		sc.close();
	}
}
