// Q.19. Print nth fibonacci series?
package basics;

import java.util.Scanner;

public class Question_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : " );
		int number = sc.nextInt();
		
		int a = 0, b = 1, c = 0;
		
		for (int i = 1; i <= number - 2; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		
		System.out.println(number + "th's Fibonacci Number : " + c);
		sc.close();
	}
}
