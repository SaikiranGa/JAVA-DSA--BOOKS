// Q.42. Convert decimal number into binary and count all 1 bit in the number.
package digits;

import java.util.Scanner;

public class Question_42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Decimal Number : ");
		int number = sc.nextInt();

		int base = 2;
		int count = 0;
		String result = "";

		while (number != 0) {
			int rem = number % base;
			if (rem == 1) {
				count++;
			}
			result = rem + result;
			number = number / base;
		}
		System.out.println("Binary Number : " + result);
		System.out.println("1 Bit count : " + count);
		sc.close();
	}
}
