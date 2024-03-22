// Q.87. Strong ans Weak Password.
package string;

import java.util.Scanner;
public class Question_87 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter password : ");
		String password = sc.nextLine();
		
		boolean isUppercase = false, isLowercase = false,
				isNumeric = false, isSpecial = false;
		
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				isUppercase = true;
			} else if (ch >= 'a' && ch <= 'z') {
				isLowercase = true;
			} else if (ch >= '0' && ch <= '9') {
				isNumeric = true;
			} else if (ch == ' ') {
				System.out.println("Space is Not allowed.");
				main(null);
			} else {
				isSpecial = true;
			}
		}
		
		if (password.length() > 8 && isUppercase && isLowercase && isNumeric && isSpecial) {
			System.out.println("Password is Strong.");
		} else {
			System.out.println("Password is Not Strong.");
		}
		
		sc.close();
	}
}
