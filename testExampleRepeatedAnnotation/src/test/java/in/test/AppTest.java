package in.test;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Unit test for simple App.
 */

@TestMethodOrder(OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)

@DisplayName("TESTING CLS STARTED TESTING METHODS")
public class AppTest {

	@RepeatedTest(value = 3, name = "{displayName}-{currentRepetition}/{totalRepetitions}")

	// @DisplayName("REPEATED TEST METHOD")
	public void repeatedTestMethod(TestInfo info) {
		// System.out.println("repeated test case class name :" +
		// info.getTestClass().get().getName());
		// System.out.println("repeated test class method name :" +
		// info.getTestMethod().get().getName());
		System.out.println("repeated display name :" + info.getDisplayName());
	}

	public static void main(String[] args) {
	}

}
