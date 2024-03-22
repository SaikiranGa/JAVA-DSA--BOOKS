// Q.112 StringBuffer

/*
StringBuffer : The StringBuffer class is used to create mutable string object.
			   It is similar to String class except It is mutable and Thread safe.
			   StringBuffer object allows to modified the content of a string without creating new object every time.
			   The Object is created in heap area not in string pool constant.
				
 */

/*

String vs StringBuffer

String
1. It is immutable
2. String performs concactination slower
3. String uses string constant pool
4. String uses more memory and is less efficient.
5. String overrides equals() and hashCode() methods of Object class.

StringBuffer
1. It is mutable
2. StringBuffer performs concatination faster
3. StringBuffer uses heap memory.
4. StringBuffer uses less memory and is more efficient.
5. StringBuffer does not overrides equals() and hashCode() methods.

StringBuilder : It is used to create mutable string objects.
				It is same as StringBuffer but it is not synchronized (thread safe).

*/
package string;

public class Question_112 {
	public static void main(String[] args) {
		// String 
		String s = "Jspiders ";
		s = s.concat("Thane");
		System.out.println(s);
		
		// StringBuffer
		StringBuffer sb = new StringBuffer("Qspiders ");
		sb.append("Thane");
		System.out.println(sb);
		sb.insert(1, "PySipder ");
		System.out.println(sb);
		sb.replace(1, 9, "");
		System.out.println(sb);
		sb.delete(1, 2);
		System.out.println(sb);
		sb.reverse();
		// StringBuffer Convert into String
		System.out.println(sb.toString());
		String s1 = new String(sb);
		System.out.println(s1);
		
	}
}
