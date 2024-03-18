package String;

public class Palimdrome {

	public static void main(String[] args) {
		//racecar
		String name = "racecar";
		String val = "";
		
		for(int i=name.length()-1;i>=0;i--) //i=6
		{
			char c=name.charAt(i);
			val=val+c; //r
			
		}
		
		System.out.println(val);
		
		if(name.equals(val))
		{
			System.out.println("Palimdrome");
		}
		else
		{
			System.out.println("Not Palimdrome");
		}
	}

}
