//Q.109. selection sort in string.
package string;

import java.util.Arrays;

public class Question_109 {
	public static void main(String[] args) {
//		String s = "hiu";
//		String s1 = "hi";
//		System.out.println(s.compareTo(s1));

		String[] s = { "Saiteja", "Saikiran", "Soham", "Shiva", "Vikas", "Amit", "Souraw", "Salgar" };

		for (int i = 1; i < s.length; i++) {
			int j = i;
			String temp = s[i];
			while (j > 0 && s[j - 1].compareTo(temp) > 0) {
				s[j] = s[j - 1];
				j--;
			}
			s[j] = temp;

		}
		System.out.println("ASC : " + Arrays.toString(s));
		
		
		for (int i = 1; i < s.length; i++) {
			int j = i;
			String temp = s[i];
			while (j > 0 && s[j - 1].compareTo(temp) < 0) {
				s[j] = s[j - 1];
				j--;
			}
			s[j] = temp;

		}
		System.out.println("DESC : " + Arrays.toString(s));

	}
}
