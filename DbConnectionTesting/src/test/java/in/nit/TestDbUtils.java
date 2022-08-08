package in.nit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDbUtils {

	private Connection connection;
	private Connection connection1;
	private DbUtilsConnection utilsConnection;

	@BeforeEach
	public void setpu() {
		connection = connection1 = null;
		utilsConnection = new DbUtilsConnection();
	}

	@Test
	public void testGetConnection() {
		connection = DbUtilsConnection.getConnection();
		connection1 = DbUtilsConnection.getConnection();

		if (connection == null || connection1 == null) {
			fail("could not establish the connection");
		} else {
			System.out.println("connection established    " + connection.getClass().getName());
		}

		assertSame(connection1, connection, "may not have same connection");

	}

	@AfterEach
	public void cleanUp() {
		connection = connection1 = null;
		utilsConnection = null;
	}
}
