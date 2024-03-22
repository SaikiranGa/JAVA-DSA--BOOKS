// Q.101 roman to number
package string;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Question_101 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Map<Character, Integer> roman = new HashMap<Character, Integer>();

		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);

		System.out.print("Enter roman : ");
		String s = scr.next();

		s = s.replace("IV", "IIII");
		s = s.replace("IX", "VIIII");
		s = s.replace("XL", "XXXX");
		s = s.replace("XC", "LXXXX");
		s = s.replace("CD", "CCCC");
		s = s.replace("CM", "DCCCC");

//		s = s.toUpperCase();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			sum = sum + roman.get(ch);
		}
		System.out.println("Integer : " + sum);
		scr.close();
	}
}
