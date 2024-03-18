package javapractice;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter RollNo.::");
		int rollNo = sc.nextInt(); 
		// When you use nextInt(), it reads the integer value but leaves the newline character (\n) in the input buffer. When you then use nextLine(), it reads this newline character and returns an empty string.
		//To fix this, you can add an extra sc.nextLine() after nextInt() to consume the newline character before reading the name.
		sc.nextLine();
		System.out.println("Roll No is :" + rollNo);
		
		System.out.println("Enter Name::");
		String Name = sc.nextLine();
		System.out.println("Name is :" + Name);

		
	 
	}

}
