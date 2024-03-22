// Q.26. Separate digits
// formula : lhs Operations rhs = result
// if operand 1 is % operand 2 = operand 1
// if operand 1 is / operand 2 = 0
// eg. : 9843 % 10 = 3 ........... 9843 /10 = 984
// 984 % 10 = 3 ........... 984 /10 = 984
// 984 % 10 = 3 ........... 984 /10 = 98
// 984 % 10 = 3 ........... 984 /10 = 98
// 98 % 10 = 3 ........... 98 /10 = 9
// 9 % 10 = 3 ........... 9 /10 = 0
package digits;

import java.util.Scanner;

public class Question_26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		String result = "";
		
		while(number != 0) {
			int digit = number % 10;
			result = digit + " "+ result;
			number = number /10;
		}

		System.out.println("Separet Digit : " + result);
		sc.close();
	}
}
