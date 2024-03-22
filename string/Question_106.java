// Q.106. recursion
package string;

public class Question_106 {
	public static void main(String[] args) {
		String s = "aaaaahiaahiaaaaaahiaaaahia";
		System.out.println("Total Hi present in the String : " + countHi(s));
	}

	public static int countHi(String s) {
		if (s.contains("hi")) {
			return 1 + countHi(s.substring(s.indexOf("hi") + 2));
		} else {
			return 0;
		}
	}
}
