// Q.7. Print Numbers 1 to 5 Not Using Loops?
package basics;

public class Question_7 {
	public static void main(String[] args) {

		System.out.println("Main Method Starts.");
		recursive(1);
		System.out.println("Main Method Ends.");
		
	}
	
	public static void recursive(int range) {
		if (range <= 5) {
			System.out.println(range);
			recursive(++range);
		}
	}
}
