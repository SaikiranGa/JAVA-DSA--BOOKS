// Q.20. Check if two triangle's area is same or not.
package basics;

import java.util.Scanner;

public class Question_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Triangle's base and height.");

		System.out.print("Base : ");
		double base1 = sc.nextDouble();

		System.out.print("Height : ");
		double height1 = sc.nextDouble();

		System.out.println("Enter 1st Triangle's base and height.");

		System.out.print("Base : ");
		double base2 = sc.nextDouble();

		System.out.print("Height : ");
		double height2 = sc.nextDouble();

		double area1 = (base1 * height1) / 2;
		double area2 = (base2 * height2) / 2;

		if (area1 > area2) {
			System.out.println("1st Triangle area is greator : " + area1);
		} else {
			System.out.println("2nd Triangle area is greator : " + area2);
		}

		sc.close();
	}
}
