package ExpectionHandlersPackage;

public class Myclass {
	
	public static void main(String[] args) {
		System.out.println(myMethod());
	}
	
	public static int myMethod(){
		try {
			return 0;
		}finally {
			System.out.println("This is finally block");
			System.out.println("Finally block ran even after return statement");
		}
	}
}