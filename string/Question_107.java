// Q.107. to swap 2 string without using 3rd variable.
package string;

public class Question_107 {
	public static void main(String[] args) {
		// With using third variable.
		String a = "pine";
		String b = "apple";
		System.out.println("/====Before====/");
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		System.out.println("/====After====/");
		String temp = a;
		a = b;
		b = temp;
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		System.out.println();
		// Without using third variable.
		System.out.println("/====Before====/");
		String x = "pine";
		String y = "apple";
		System.out.println("x : " + x);
		System.out.println("y : " + y);

		System.out.println("/====After====/");
		x = x + y;
		System.out.println(x);
		y = x.substring(0, x.length() - y.length());
		x = x.substring(y.length());
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
