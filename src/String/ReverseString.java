package String;

public class ReverseString {

	public static void main(String[] args) {
		//String s= "Apple";  /// string literal
		//String str= new String("Mango");  // using new keyword
		
		StringBuilder s1 = new StringBuilder("Apple");
		StringBuilder s2 = new StringBuilder("Mango");
		
		s1.reverse();
		s2.reverse();
		
		System.out.println(s1);	
		System.out.println(s2);	
		
		
		StringBuffer s3 = new StringBuffer("Mango");
		s3.reverse();
		System.out.println(s3);
		
	}

}
