// Q.4. Given an integer n, for every integer i <= n, 
// the task is to print “FizzBuzz” if i is divisible by 3 and 5, 
// “Fizz” if i is divisible by 3, “Buzz” if i is divisible by 5 
// or i (as a string) if none of the conditions are true.
package basics;

import java.util.Scanner;

public class Question_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz.");
			} else if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz.");
			} else if (i % 3 != 0 && i % 5 == 0) {
				System.out.println("Buzz.");
			} else {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
