package javapractice;

public class GreaterNumber {

	public static void main(String[] args) {
		int num1=8, num2=22;
		int num3=num1>num2?num1:num2;
		System.out.println(num3);
		
		if(num1>num2)
		{
			System.out.print("Greater No.is"+ " "+num1);
		}else
		{
			System.out.print("Greater No.is"+ " "+num2);
		}
		

	}

}
