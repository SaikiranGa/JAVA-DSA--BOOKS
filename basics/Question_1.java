// Q.1. WAP to print 1 to 5 using all loops?

package basics;

public class Question_1 {
	public static void main(String[] args) {
		int i = 1;
		
		System.out.println("While Loop");
		
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("For Loop.");
		for (i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("Do While Loop.");
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 5);
	}
}
