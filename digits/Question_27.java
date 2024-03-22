// Q.27 to print the even digits from the number.
package digits;

import java.util.Scanner;

public class Question_27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		
		String result = "";
		
		System.out.print("Even Number : ");
		while(number != 0) {
			int digit = number % 10;
			if (digit % 2 == 0) {
				result = digit + " " + result;
			}
			number = number / 10;
		}
		
		System.out.print(result);
		
		sc.close();
	}
}
