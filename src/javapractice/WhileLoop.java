package javapractice;

public class WhileLoop {
//Java Program to Display Even Numbers From 1 to 100- using while and do-while

	public static void main(String[] args) {
		int i=1;
		while(i<=100)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
		i++;
		}
		
//		do {
//			if(i%2==0)
//			{
//			System.out.println(i);
//			}
//			i++;
//		}while(i<=100);
	}
}
