// Q.6. The range to find product of total number?
package basics;

import java.util.Scanner;

public class Question_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		
		int product = 1;
		for (int i = 1; i <= range; i++) {
			product = product * i;
		}
		
		System.out.println("Product : " + product);
		
		sc.close();
	}
}
