// Q.32. print all the niven number in the range.
package digits;

import java.util.Scanner;

public class Question_32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Range : ");
		int number = sc.nextInt();
		
		System.out.print("Niven Number : ");
		for (int i = 1; i <= number; i++) {
			int num = i;
			int temp = num;
			int sum = 0;
			while(num != 0) {
				int digit = num % 10;
				sum = sum + digit;
				num = num / 10;
			}
			if (temp % sum == 0) {
				System.out.print(temp + " ");
			}
		}
		
		System.out.print("\nNiven Number : ");
		niven(number);
		
		sc.close();
	}
	
	public static void niven(int num){
		for (int i = 1; i <= num; i++){
			int temp = i;
			int sum = 0;
			while(temp != 0){
				int digit = temp % 10;
				sum = sum + digit;
				temp = temp / 10;
			}
			if (i % sum == 0){
				System.out.print(i + " ");
			}
		}
	}
}
