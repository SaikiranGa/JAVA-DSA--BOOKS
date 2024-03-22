// Q.3. Find even and odd number in the range of user input?
package basics;

import java.util.Scanner;

public class Question_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		
		String even = "", odd = "";

		sc.close();

		int i = 0;
		for (i = 1; i <= range; i++) {
			if (i % 2 == 0) {
				even = even + " " + i;
			} else if (i % 2 != 0) {
				odd = odd + " " + i;
			} else {
				System.out.println("Invicible Output.");
			}
		}
		System.out.println("Odd Number : " + odd);
		System.out.println("Even Number : " + even);
	}
}
