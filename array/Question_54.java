// Q.54. Check whether array is Palidrome or not.
package array;

public class Question_54 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 2, 1};
		int[] arrClone = arr.clone();
		
		System.out.print("The Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for (int i = 0, j = arrClone.length - 1; i < arrClone.length; i++, j--) {
			int temp = arrClone[i];
			arrClone[i] = arrClone[j];
			arrClone[j] = temp;
		}
		
		boolean flag = true; // assuming that it is palidrome.
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arrClone[i]) {
				flag = false;
				break;
			}
		}
		
		if (flag) {
			System.out.println(" --> Palidrome.");
		} else {
			System.out.println(" --> Not a Palidrome.");
		}
		
	}
}
