// Q.12. Write a Program to check if the number is prime number or not.
package basics;

import java.util.Scanner;

public class Question_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to check if it's prime: ");
        int number = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        
		System.out.println(count);
		
		if (count == 2) {
			System.out.println("Prime Number.");
		} else {
			System.out.println("Not a Prime Number.");
		}
		
		sc.close();
	}
}
