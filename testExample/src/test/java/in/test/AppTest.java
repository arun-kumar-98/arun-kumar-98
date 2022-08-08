package in.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Unit test for simple App.
 */

@TestMethodOrder(OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)

public class AppTest {

	/**
	 * @BeforeAll annotation:- method should be static it's execute once in while
	 *            execute the code
	 */

	@BeforeAll
	public static void beforeAll() {
		System.err.println("before all setup");
	}

	@BeforeEach
	public void setup() {
		System.out.println("setup data");
	}

	@Test

	public void shouldAnswerWithTrue() {
		System.out.println("hello :: shouldAnswerWithTrue");
	}

	@Test

	public void testsave() {
		System.out.println("hello :: testsave()");
	}

	@Test

	public void testUpdate() {
		System.out.println("hello :: testUpdate()");
	}

	@AfterEach
	public void clear() {
		System.out.println("after each");
	}

	/**
	 * @AfterAll annotation method should be static it's execute once in while
	 *           execute the code
	 */
	@AfterAll
	public static void afterAll() {
		System.err.println("after all method");
	}
}
