// Q.84. remove all spaces from string.
package string;

public class Question_84 {
	public static void main(String[] args) {
		String s = "   Welcome to bhiwandi";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				res = res + s.charAt(i);
			}
		}
		
		System.out.println(res);
	}
}
