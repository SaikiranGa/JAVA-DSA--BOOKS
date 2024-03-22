// Q.25. Find power of number?
package basics;

import java.util.Scanner;

public class Question_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		long number = sc.nextLong();
		
		System.out.print("Enter Power : ");
		long power = sc.nextLong();
		
		long result = 1;
		
		for (int i = 1; i <= power; i++) {
			result = result * number;
		}
		
		System.out.println("Result Of "+ number+ "^" +power+ " : " + result);
		
		sc.close();
	}
}
