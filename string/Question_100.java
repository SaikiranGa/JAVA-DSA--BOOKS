// Q.100 duplicates words count.
package string;

public class Question_100 {
	public static void main(String[] args) {
		String s = "java is a programing langauge Java is high level programing langauge";

		String[] strArr = s.split(" ");

		boolean[] b = new boolean[strArr.length];

		int totalCount = 0;

		for (int i = 0; i < strArr.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < strArr.length; j++) {
					if (strArr[i].equalsIgnoreCase(strArr[j])) {
						count++;
						b[j] = true;
					}
				}
				if (count > 1) {
					System.out.print(strArr[i] + " ");
					totalCount++;
				}

			}
		}
		System.out.print(totalCount);

	}
}
