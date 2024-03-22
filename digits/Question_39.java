// Q.39. Convert Decimal into Binary.
package digits;

import java.util.Scanner;

public class Question_39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Decimal Number : ");
		int number = sc.nextInt();
		
		int base = 2;
		String result = "";
		
		while(number != 0) {
			int rem = number % base;
			result = rem + result;
			number = number / base;
		}
		
		System.out.println("Binary Number : " + result);
	
		sc.close();
	}
}
