// Q.30. Give discount only if bill is an odd number.
package digits;

import java.util.Scanner;

public class Question_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Bill : ");
		int bill = sc.nextInt();
		int discount = 0;
		
		while(bill != 0) {
			int digit = bill % 10;
			if (digit % 2 != 0) {
				discount = discount + digit;
			}
			bill = bill / 10;
		}
		
		System.out.print("Discount is " + discount + "%.");
		
		sc.close();
	}
}
