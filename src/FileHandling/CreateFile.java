package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		// WAP to create a file.
		
		File file= new File("C:\\Users\\amanp\\OneDrive\\Documents\\test3.txt");
		try {
			if(file.createNewFile())
			{
				System.out.println("File name is :" + file.getName());

			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		//WAP to write into the file.
		try {
			FileWriter fw= new FileWriter("C:\\Users\\amanp\\OneDrive\\Documents\\test3.txt");
			fw.write("This is my test file");
			System.out.println("Successfully written");
			fw.close();
			
			
			
			// WAP to read from a file.
			File file1= new File("C:\\Users\\amanp\\OneDrive\\Documents\\test3.txt");
			Scanner sc= new Scanner(file1);
			while(sc.hasNext())
			{
				String readData= sc.nextLine();
				System.out.println(readData);
			}
			
			
			//WAP to delete unused file.
			
			File file2= new File("C:\\Users\\amanp\\OneDrive\\Documents\\test.txt");
			file2.delete();
			System.out.println("File deleted successfully");
					
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
