package Inheritance;

public class SuperMain {

	public static void main(String[] args) {
		SuperChild ob = new SuperChild();
		System.out.println(ob.add(10, 20));
		//System.out.println(ob.addition());
	
		System.out.println(ob.multiplication());
		System.out.println(ob.multiply(2, 1));
		
	}

}
