package javapractice;

public class FibonacchiSeries {
	
	public static void main(String[] args) {
		int count =5,num1=0, num2=1,num3;
		System.out.print(num1+" "+num2);
		
		for(int i=1;i<=count;i++)
		{
			num3=num1+num2;
			System.out.print(" "+ num3);
			num1=num2; 
			num2=num3;
		}
		
	}

}
