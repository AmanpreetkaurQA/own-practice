package String;

public class RemoveDuplicateCharFroString {

	public static void main(String[] args) {
		String name = "amanpreet";
		String val="";
		
		for(int i=0; i<name.length();i++)
		{
			String temp = ""+name.charAt(i);
	      		if(!(val.contains(temp)))
			{
				val=val+temp;
			}
	      		
		}
		System.out.println(val);

	}

}
