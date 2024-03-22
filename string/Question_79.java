//Q.79. String 

/*
 # String 
  	1. String is a group of characters but in Java String is a class which is present inside java.lang.package.
  	2. It is a final class that is it can not have any sub class.
  	3. String class is used to create immutable String Objects.
  	4. String class inherits (i). CharaSequence interface, 
  							 (ii). Comparable interface, and 
  							 (iii). Serializable interface.
 
Q. How to create string objects :
A: 1. Using String literal --> String s = "Java.";
   
   (1). if we create a string object using String literal object is created inside string constant pool area that is present inside heap area.
   (2). The jvm first check the string constant pool if there is an object with the same data  if yes then address of the same object is return. if no then it will create a new object in string constant pool and return the address.
   (3). SCP (String Constant Pool) duplicate object is not allowed.
	e.g., 
		String s1 = "Java.";
		String s2 = "Java.";
		System.out.println(s1 == s2); // true.
		
	
   2. Using new keyword --> String s = new String("Java.");
   (1). If we create a String object using new keyword then the object will be created inside heap area and the address of the heap area will be return.
   (2). Also One more object will be created in SCP (String Constant Pool) whose address will be stored by the JVM internally.
   (3). Heap area duplicate object is allowed.
    e.g.,
    	String s1 = new String("Java.");
    	String s2 = new String("Java.");
    	System.out.println(s1 == s2); // false
   
 */
package string;

public class Question_79 {
	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "java";
		System.out.print("Without new keyword : ");
		System.out.println(s1 == s2);
		
		String s3 = new String("java");
		String s4 = new String("java");
		System.out.print("With new keyword : ");
		System.out.println(s3 == s4);
	
		String s5 = new String("christmas");
		System.out.println("Chat at 0 index : " + s5.charAt(0));
		
		String s6 = new String("javedkhan.");
		System.out.println("Length of String : " + s6.length());

		
	}
	
}
