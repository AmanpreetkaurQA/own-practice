package javapractice;

public class StudentInfo {
	int rollNo;
	String name;
	Double marks;
	
	public StudentInfo(int rollNo,String name,double marks)
	{
		this.rollNo=rollNo;    
		this.name=name;
		this.marks=marks;
	}
	
	public StudentInfo()
	{
		rollNo=42;    
		name= "Aman";
		marks= 88.5;
	}
	public StudentInfo(StudentInfo n)
	{
		rollNo=n.rollNo;    
		name=n.name;
		marks=n.marks;
	} 
	
	public void display()
	{
		System.out.println(rollNo);
		System.out.println("Name: "+name);
		System.out.println(marks);
	};
	

}
