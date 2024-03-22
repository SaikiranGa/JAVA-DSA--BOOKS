// Q.81. Palindrome String
package string;

public class Question_81 {
	public static void main(String[] args) {
		String str = "[Nitin] ";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println("The String : " + str);
		System.out.println("The Reverse String : " + rev);
		System.out.println();
		
		System.out.println("Comparint the Strings with equals() method.");
		if (str.equals(rev)) {
			System.out.println("Palindrome.");
		} else {
			System.out.println("Not a Palindrome.");
		}
		System.out.println();
		
		System.out.println("Comparing the Strings with equalsIgnoreCase() method.");
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome.");
		} else {
			System.out.println("Not a Palindrome.");
		}
		System.out.println();
		
		str = str.trim();
		String rev1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev1 = rev1 + str.charAt(i);
		}
		System.out.println("After removing space from string : " + str);
		System.out.println("And Reverse String : " + rev1);
		System.out.println();
		
		System.out.println("Then comparing Strings with equalsIgnoreCase() method.");
		if (str.equalsIgnoreCase(rev1)) {
			System.out.println("Palindrome.");
		} else {
			System.out.println("Not a Palindrome.");
		}
		
	}
}
