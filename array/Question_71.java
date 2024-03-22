// Q.71
package array;

public class Question_71 {
	public static void main(String[] args) {
		int n = 898989;
		int sum = 0;
		while (n != 0 || sum > 9) {
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			int digit = n % 10;
			sum = sum + digit;	
			n = n / 10;				
		}
		System.out.println("1st : " + sum);
		
		int num = 898989;
		while (num != 0) {
			if (num <= 9) {
				break;
			}
			num = num % 10 + num / 10;				
		}
		System.out.println("2nd : " + num);
		
		int k = 898989;
		if (k == 0) { 
			System.out.println("3rd : " + 0);
		} else if (k % 9 == 0) {
			System.out.println("3rd : " + 9);
		} else {
			System.out.println("3rd : " + k % 9);
		}
	}
}
