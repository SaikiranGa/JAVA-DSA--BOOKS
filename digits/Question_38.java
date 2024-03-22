// Q.38. ArmStrong Number.
package digits;

import java.util.Scanner;

public class Question_38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		int temp = number;
		int count = count(number);
		int sum = 0;

		while (temp != 0) {
			int digit = temp % 10;
			sum = sum + power(digit, count);
			// sum = sum + digit * digit * digit;
			temp = temp / 10;
		}
	
		if (sum == temp) {
			System.out.println("ArmStrong Number.");
		} else {
			System.out.println("Not a ArmStrong Number.");
		}
		sc.close();
	}
	
	public static int power(int number, int count) {
		int answer = 1;
		for (int i = 0; i < count; i++) {
			answer = answer * number;
		}
		return answer;
	}
	
	public static int count(int number) {
		int count = 0;
		while(number != 0) {
			number = number / 10;
			count++;
		}
		return count;
	}
}
