// Q.16. Fibonacci series.
package basics;

import java.util.Scanner;

public class Question_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		
		int a = 0, b = 1, c;
		
		System.out.print(a + " " + b + " ");
		
		for (int i = 0; i < number - 2; i++) {

			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		
		sc.close();
	}
}
