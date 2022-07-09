
public class test {
	public static void main() {
		try {
			throw 10;
		}
		catch(int e) {
			System.out.println("gor the exp" +e);
		}
	}
}
