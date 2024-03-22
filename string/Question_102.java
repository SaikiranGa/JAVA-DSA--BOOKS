// Q.101. to check if the string is a panagram. contains all 26 alphabet.
package string;

import java.util.Set;
import java.util.HashSet;

public class Question_102 {
	public static void main(String[] args) {
		String s = "The quick brown 'fox' jumps over a lazy dog.";

		Set<Character> set = new HashSet<Character>();

		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				set.add(c);
			}
		}

		if (set.size() == 26) {
			System.out.println("Panagram." + set.size());
		} else {
			System.out.println("Not a Panagram." + set.size());
		}

	}
}
