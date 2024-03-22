// Q.8. Print Numbers 5 to 1 Not Using Loops?
package basics;

public class Question_8 {
	public static void main(String[] args) {
		
		System.out.println("Main Method Start");
		recursive(5);
		System.out.println("Main Method Ends.");
		
	}
	
	public static void recursive(int range) {
		if (range >= 1) {
			System.out.println(range);
			recursive(--range);
		}
	}
}
