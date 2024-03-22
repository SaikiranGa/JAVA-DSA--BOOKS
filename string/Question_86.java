// Q.86. toggleCase
package string;

public class Question_86 {
	public static void main(String[] args) {
		String s = "iTacHi";
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				res = res + (char) (s.charAt(i) - 32);
			} else if (ch >= 'A' && ch <= 'Z') {
				res = res + (char) (s.charAt(i) + 32);
			} else {
				res = res + ch;
			}
		}
		System.out.println("Togglecase : " + res);
	}
}
