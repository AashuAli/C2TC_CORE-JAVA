
public class Unboxing {

	public static void main(String[] args) {
		
		Integer a=new Integer(3);
		int i=a.intValue(); //Converting Integer to int Explicitly 
		// or
		Integer x = 3;
		int j=x; //unboxing
		System.out.println(a+" "+i+" "+j+ " "+x);
		

	}

}
