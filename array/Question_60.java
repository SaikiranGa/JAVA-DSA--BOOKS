// Q.60.
package array;

public class Question_60 {
	public static void main(String[] args) {
		int arr[] = {9, 5, 12, 25, 16};
		int sum = 0;
		int k = 6;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + (arr[i] % k);
		}
		System.out.println("sum : " + sum);
	}
}
