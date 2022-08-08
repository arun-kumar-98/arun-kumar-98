package in.nit.AssertAPITesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test

	public void testCase() {
		String actual = "hello";
		String expected = "hello";
		Assertions.assertEquals(expected, actual);
	}

}
