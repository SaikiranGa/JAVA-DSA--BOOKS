// Q.80.reverse string
package string;

public class Question_80 {
	public static void main(String[] args) {
		String s = "saiteja";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i-- ) {
			rev = rev + s.charAt(i);
		}
		System.out.println("The String : " + s);
		System.out.print("Reverse of String : ");
		System.out.println(rev);
	}
}
