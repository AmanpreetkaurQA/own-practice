package javapractice;

public class Constructor {

	public static void main(String[] args) {
		StudentInfo s = new StudentInfo();
		StudentInfo s1 = new StudentInfo(4, "Aman", 99);
		StudentInfo s2 = new StudentInfo(s1);
		
		s1.display();
		s2.display();
		s.display();

	}

}
