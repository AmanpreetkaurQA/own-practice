package Polymorphism;

public class ConstructorOverloadingEx {
	int rollnumber,marks;
	String name;
	 
	
	public ConstructorOverloadingEx(int rollnumber, int marks) 
		{
			this.rollnumber= rollnumber;
			this.marks=marks;
			/*
			 * System.out.println(rollnumber); System.out.println(marks);
			 */
		}
	
	public ConstructorOverloadingEx(int rollnumber, int marks, String name) 
	{
		this.rollnumber= rollnumber;
		this.marks=marks;
		this.name=name;
		/*
		 * System.out.println(rollnumber); System.out.println(marks);
		 * System.out.println(name);
		 */
		
	}
	public void display()
	{
		System.out.println(name+" "+rollnumber+" "+marks);
		
	}
}
