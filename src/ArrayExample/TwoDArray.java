package ArrayExample;

public class TwoDArray {

	public static void main(String[] args) {
		//* 
		//* *
		//* * *
		//* * * *     

		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
				
			}
				System.out.println();
		}
		
		
		        //1 
				//1 2
				//1 2 3
				//1 2 3 4 
				//1 2 3 4 5
				//1 2 3 4 5 6
		 
		int rows=6;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print(" ");
				
			}
				System.out.println();
		} 
				
		
		  //1 
		  //2 3
		  //4 5 6
		  //7 8 9 10
		
		int row=4;
		int var=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(var);
				var++;
				System.out.print(" ");
				
			}
				System.out.println();
		} 
		
	}

}
