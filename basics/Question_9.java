// Q.9. Print total number of sum 
package basics;

public class Question_9 {
	static int sum;

	public static void main(String[] args) {
		System.out.println("Main Methods Starts");
		System.out.println("Sum of all number : " + recursive(8));
		System.out.println("Main Methods Ends.");
	}

	public static int recursive(int range) {
		if (range > 0) {
			recursive(range - 1);
		}
		sum = sum + range;
		return sum;
	}
}
