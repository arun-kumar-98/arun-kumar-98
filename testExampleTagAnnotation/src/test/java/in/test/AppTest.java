package in.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

/**
 * Unit test for simple App.
 */

public class AppTest {

	@RepeatedTest(value = 2, name = "{displayName}-{currentRepetition}/{totalRepetitions}")
	@Tag("prod")
	@DisplayName("PRODUCTION TEST CASES IS EXECUTING......")
	public void testProd(TestInfo info) {
		System.out.println("PRODUCTION ENVIRONMENT TEST CASES AND DISPLAY  :" + info.getDisplayName());
	}

	@RepeatedTest(value = 3, name = "{displayName}-{currentRepetition}/{totalRepetitions}")
	@Tag("dev")
	@DisplayName("DEV TEST CASES IS EXECUTING.......")
	public void testDev(TestInfo info) {
		System.out.println("DEVELOPER ENVIRONMENT TEST CASES EXECUTING  :" + info.getDisplayName());
	}
	
	@RepeatedTest(value = 3, name = "{displayName}-{currentRepetition}/{totalRepetitions}")
	@Tag("dev")
	@DisplayName("DEV TEST CASES IS EXECUTING.......")
	public void testDev1(TestInfo info) {
		System.out.println("DEVELOPER ENVIRONMENT TEST CASES EXECUTING  :" + info.getDisplayName());
	}
	@RepeatedTest(value = 3, name = "{displayName}-{currentRepetition}/{totalRepetitions}")
	@Tag("dev")
	@DisplayName("DEV TEST CASES IS EXECUTING.......")
	public void testDev2(TestInfo info) {
		System.out.println("DEVELOPER ENVIRONMENT TEST CASES EXECUTING  :" + info.getDisplayName());
	}
	
	
	@RepeatedTest(value = 2, name = "{displayName}-{currentRepetition}/{totalRepetitions}")
	@Tag("prod")
	@DisplayName("PRODUCTION TEST CASES IS EXECUTING......")
	public void testProdAgain(TestInfo info) {
		System.out.println("PRODUCTION ENVIRONMENT TEST CASES AND DISPLAY  :" + info.getDisplayName());
	}

}
