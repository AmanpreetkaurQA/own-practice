package ExceptionHandling;

public class Arithmetic extends Exception {

	public static void main(String[] args) {
		//WAP to handle divide by zero error.
		//WAP to demonstrate user-define exception. (Hint: You can use any example, I have added the program in doc as well.) 
		//Program: User-defined exception by accepting a number from a user and throw an exception if the number is not a positive number. (Try this; Hint: to accept the input from user make use of Scanner class) 
		try{
			int x=10;
			System.out.println(x/0);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
