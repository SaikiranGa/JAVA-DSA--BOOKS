// Q.85. convert to Uppercase.without inbuilt method.

//a --> 97 - 32 = 65
//A --> 65 + 32 = 97
package string;

public class Question_85 {
	public static void main(String[] args) {
		String s = "SaiTeja";
		

		System.out.println("Uppercase : " + toUpperCase(s));
		System.out.println("LowerCase : " + toLowerCase(s));
	}
	
	public static String toUpperCase(String str) {
		String upperCase = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				upperCase = upperCase + (char) (str.charAt(i) - 32);
			} else {
				upperCase = upperCase + ch;
			}
		}
		
		return upperCase;
	}

	public static String toLowerCase(String str) {
		String lowerCase = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				lowerCase = lowerCase + (char) (str.charAt(i) + 32);
			} else {
				lowerCase = lowerCase + ch;
			}
		}
		return lowerCase;
	}
}
