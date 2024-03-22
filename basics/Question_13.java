// Q.13. Write a program print all prime number in the range of numbers?
package basics;

import java.util.Scanner;

public class Question_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		
		for (int i = 1; i <= range; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			
			if (i == 1) {
				System.out.println("All Prime Numbers in Your range : " + range);
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}
}
