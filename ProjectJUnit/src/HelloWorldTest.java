import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class HelloWorldTest implements TestLifecycleLogger {
	@Test
	@RepeatedTest(10)
	void test() {
		System.out.println("test case passed");
	}

}
