// Q.2. WAP to print number 1 to 10 that stop at 7 and skip 4?
package basics;

public class Question_2 {
	public static void main(String[] args) {
		System.out.println("continue --> to skip the iteration.");
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("break --> to stop the loop.");
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.print(i + " ");
		}
	}
}
