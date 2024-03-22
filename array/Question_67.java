// Q.67 MultiDimensional Array.. 

//1. using array literal
//data_type[][] variable = {{1,2},{3,4},{5,6}};
//2. using new keyword
//variable = new data_type[outer_size][inner_size];
// Multidimensional array is arrays of array
//
package array;

public class Question_67 {
	public static void main(String[] args) {
		int[][] arr = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 0 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
