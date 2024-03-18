package Inheritance;

public class SuperChild extends SuperParent{
	public int add(int a, int b)
	{
		int c= a+b;
		return c;
	}
	
	
	
	/*
	 * public int addition() { return super.add(a, b); }
	 */
	 
	 
	public int multiply(int a,int b)
	{
		int c= a*b;
		return c;
	}
	
	
	  public int multiplication()
	  	{ 
		  return super.multiply(15, 15); 
		}
	 
}
