package in.nit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDbUtils {

	@Test
	public void testNormal() {

		assertAll(() -> {
			assertNotNull(DbUtilsConnection.getConnection());
		}, () -> {
			Connection con1, con2;
			con1 = DbUtilsConnection.getConnection();
			con2 = DbUtilsConnection.getConnection();
			assertSame(con1, con2);
		}, () -> {
			Connection con1, con2;
			con1 = DbUtilsConnection.getConnection();
			con2 = DbUtilsConnection.getConnection();
			if (con1 == null || con2 == null) {
				fail("could not connect to database");
			}
			assertSame(con1, con2, "may not conneecting to database");
		}

		);
	}

}
