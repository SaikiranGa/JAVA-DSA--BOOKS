// Q.36. to count total number of squares and cubes in the range 1 to 10.
package digits;

import java.util.Scanner;
import java.util.HashSet;

public class Question_36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		
		for (int i = 1; i <= range; i++) {
			for (int j = 1; j * j <= i; j++) {
				if (j * j == i || j * j * j == i) {
					set.add(i);
				}
			}
		}
		System.out.print("Squares & Cubes : ");
		for (Object obj : set) {
			System.out.print(obj + " ");
		}
		
		System.out.println("\nCount using HashSet : " + set.size());
		System.out.println("Count using Method : " + method(range));
		sc.close();
	}
	
	public static int method(int range) {
		int count = 0;
		for (int i = 1; i <= range; i++) {
			if (isPerfectSquare(i) || isPerfectCube(i)) {
				// System.out.print(i);
				count++;
			}
		}
		return count;
	}
	
	public static boolean isPerfectSquare(int number) {
		for (int i = 1; i * i <= number; i++) {
			if (i * i == number) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isPerfectCube(int number) {
		for (int i = 1; i * i * i <= number; i++) {
			if (i * i * i == number) {
				return true;
			}
		}
		return false;
	}
}
