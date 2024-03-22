// Q.61. Bubble sorting
package array;

public class Question_61 {
	public static void main(String[] args) {
		char[] ch = {'G', 'D', 'H', 'B', 'A', 'C', 'E', 'F'};
		
		System.out.print("Array : ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		// 1st for loop is used for selection the position of the element.
		for (int i = 0; i < ch.length; i++) {
			// 2nd for loop is used to compare the element.
			// j = i + 1 is initialize with the next element means comparision starts with the next element in the array.
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		
		System.out.print("\nArray After bubble sort : ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		
	}
}
