import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	@Test
	void testOnDrive() {
	System.setProperty("ENV","DEV");
	Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
}
	@Test
	void testOnDrive1() {
		System.setProperty("ENV","PROD");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")),AssumptionDemo::message);
	}
 static	String message() {
	 return "Test Execution Failed";
 }
}
	
