import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class AssertDemo {
	
	@Test // Test the failure and sucess for this below method
public void simple() {
	int result=1;
	int expected=1;
	assertEquals(result,expected);
}
	@Test
	void AsserDemo1() {
		int result=1;
		int expected=2;
		assertEquals(result,expected);
	}
	@Disabled  // it will skip the below method
	@Test
	void AsserDemo2() {
		int result=1;
		int expected=3;
		assertEquals(result,expected);
	}
}
