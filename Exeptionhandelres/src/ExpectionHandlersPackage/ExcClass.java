package ExpectionHandlersPackage;

public class ExcClass {

	public static void main(String[] args) {
		ExcClass obj =  new ExcClass();
		obj.diplay();
	}
	
	public void diplay() {
		try {
			System.out.println(100/0);
		}catch(ArithmeticException e) {
			System.out.println("Zero division expection");
		}
	}

}