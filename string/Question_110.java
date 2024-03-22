// Q.110
package string;

public class Question_110 {
	public static void main(String[] args) {
		String send = "SOSSOSSOSSOS";
		String recieve = "SOS1ORSOTSOS";
		
		int length = send.length();

		int count = 0;

		for (int i = 0; i < length; i++) {
			char c1 = send.charAt(i);
			char c2 = recieve.charAt(i);
			if (c1 != c2) {
				count++;
			}
		}

		System.out.println(count);
		javedStr(recieve);
	}
	
	public static void javedStr(String str) {
		int n = str.length() / 3;
		
		String og = "";
		for (int i = 0; i < n; i++) {
			og = og + "SOS";
		}
		
		int count = 0;
		for (int i = 0; i< str.length(); i++) {
			char c1 = str.charAt(i);
			char c2 = og.charAt(i);
			if (c1 != c2) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
