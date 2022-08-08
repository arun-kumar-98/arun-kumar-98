package in.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Unit test for simple App.
 */

@TestMethodOrder(OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)
@DisplayName("AppTest class Testing")
public class AppTest {

	@DisplayName("method level testing")
	@Test
	public void testSave() {
		System.out.println("hello:: save ");
	}

	@Test
	@DisplayName("method level update")
	@Disabled
	public void testUpdate() {
		System.out.println("hello::update");
	}

}
