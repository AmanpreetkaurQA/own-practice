package javapractice;

public class ConvertNumberToString {

	public static void main(String[] args) {
		int x=100;
		Integer x1 = new Integer(400); // int to Integer
		//Integer z=x;
		
		String s1 = Integer.toString(x1);
		String s = Integer.toString(x);  // converts an integer x to String
		
		System.out.println(x1+" "+s1+" "+s+" "+x);
		//System.out.println(z);

	}

}
