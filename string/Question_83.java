// Q.83. count numbers in string.
package string;

public class Question_83 {
	public static void main(String[] args) {
		String s = "p2oh33jkh20";
		int count = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				count++;
			}
		}
		System.out.println(count);
		count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				count++;
			}
		}
		System.out.println(count);
	}
}
