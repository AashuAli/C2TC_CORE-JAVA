
public class Autoboxing {

	public static void main(String[] args) {
		int a=20;
		
		Integer i=Integer.valueOf(a); //Converting int Integer Explicitly 
		// or
		Integer j=a; //autoboxing 
		
		System.out.println(a+" "+i+" "+j);
		

	}

}
