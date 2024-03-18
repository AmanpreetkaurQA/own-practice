package Interface;

public class ClassEx3 implements Interfaceex1,InterfaceEx2 {

	public int sum() {
		
		int x=10;
		int y=2;
		return x+y;
	}

	
	public void dispaly() {
		
		System.out.println("I am a class which implements Interfaces");
	}

}
