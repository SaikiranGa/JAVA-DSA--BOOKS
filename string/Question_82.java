// Q.81. to count total number of vowels in your name.
package string;

public class Question_82 {
	public static void main(String[] args) {
		String s = "PARSHURAM";
		int count = 0;
		
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}
}
