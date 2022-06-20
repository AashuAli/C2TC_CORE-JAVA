public class Apple1 {
           int weight;
         
}
class Main{
	public static void main(String args[]) {
		Apple1 a1 = new Apple1();
		Apple1 a2 = new Apple1();
		a1.weight = 1;
		a2.weight = 2;
		a2=a1;
		System.out.println(a2.weight);
	}
}