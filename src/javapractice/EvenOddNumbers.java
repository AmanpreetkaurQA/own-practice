package javapractice;

public class EvenOddNumbers {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,122};
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
			else
			{
				System.out.println(arr[i]+ "odd numbers here");
			}
		}
		

	}

}
