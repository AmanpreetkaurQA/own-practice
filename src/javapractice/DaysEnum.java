package javapractice;

	 enum Day {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}

public class DaysEnum {

	public static void main(String[] args) {
		// WAP to print 7 days and RGB
		Day d =Day.MONDAY;
		System.out.println(d);
		
		enum color
		{
			RED,
			GREEN,
			BLUE
		}
		for(color c:color.values())
			
		{
			System.out.println(c);
		}
	}

}
