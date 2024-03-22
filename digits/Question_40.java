// Q.40. Convert Decimal into Octal
package digits;

import java.util.Scanner;

public class Question_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Decimal Number : ");
		int number = sc.nextInt();
		
		int base = 8;
		String result = "";
		
		while(number != 0) {
			int rem = number % base;
			result = rem + result;
			number = number / base;
		}
		
		System.out.println("Octal Number : " + result);
		
		sc.close();
	}
}
