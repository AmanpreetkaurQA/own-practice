package Polymorphism;

public class ConstructorOverloadingMain {

	public static void main(String[] args) {
		
		ConstructorOverloadingEx c= new ConstructorOverloadingEx(4,96);
		
		ConstructorOverloadingEx c1= new ConstructorOverloadingEx(3,90,"Aman");
		c.display();
		c1.display();
	}

}
