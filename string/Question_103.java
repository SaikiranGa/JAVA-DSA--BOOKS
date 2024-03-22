// Q.103. to check if the second string is rotation of first string.
package string;

public class Question_103 {
	public static void main(String[] args) {
		String s1 = "xyz";
		String s2 = "yzx";
		s1 = s1 + s1;
		if (s1.indexOf(s2) != -1) {
			System.out.println("Rotation.");
		} else {
			System.out.println("Not a rotation.");
		}
	}
}
