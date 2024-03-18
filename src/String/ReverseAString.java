package String;

public class ReverseAString {

	public static void main(String[] args) {
		String name = "My name is Aman";
		String val="";
		for(int i=name.length()-1; i>=0;i--)
		{
			char c = name.charAt(i);
			val=val+c;
		}
		System.out.println(val);
	}

}
