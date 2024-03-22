// Q.41. Convert decimal into hexadecimal
package digits;

import java.util.Scanner;

public class Question_41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Decimal Number : ");
		int number = sc.nextInt();
		
		int base = 16;
		String hex = "";
		
		while(number != 0) {
			int rem = number % base;
			switch(rem){
				case 10: hex="A"+hex; break;
				case 11: hex="B"+hex; break;
				case 12: hex="C"+hex; break;
				case 13: hex="D"+hex; break;
				case 14: hex="E"+hex; break;
				case 15: hex="F"+hex; break;
				default: hex=rem+hex; break;
			}
			number = number / base;
		}
		
		System.out.println("Hexadecimal Number : " + hex);
		
		sc.close();
	}
}
