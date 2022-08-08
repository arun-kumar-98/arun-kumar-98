package nit.in.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import in.nit.test.Message;

public class TestMessage {

	@Test
	public void testShowMessage() {
		String expected = "welcome to :sam";
		Message message = new Message();
		String actual = message.showMessage("sam");
		Assertions.assertEquals(expected, actual);
	}

}
