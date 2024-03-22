// Q.108. check string is anagram or not.
package string;

import java.util.Arrays;

public class Question_108 {
	public static void main(String[] args) {
		// String a = "CAT";
		// a = a.toLowerCase();
		String a = "cat";
		String b = "act";
		if (a.length() == b.length()) {
			char[] c1 = a.toCharArray();
			char[] c2 = b.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not a Anagram.");
			}
		} else {
			System.out.println("Strings are not anagram.");
		}
	}
}
