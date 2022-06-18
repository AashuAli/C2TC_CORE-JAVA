package ExpectionHandlersPackage;

public class Divide {
	
	public static void main(String[] args) {
		int x = 10;
		int y =0;
		
		try {
			int res = x/y;
			System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}