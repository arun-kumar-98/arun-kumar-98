package com.tectoro.HbProj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");

		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres",
				"root");

		if (connection == null) {
			System.out.println("fail");
		} else {
			System.out.println("success");
		}

		System.out.println("Hello World!");
	}
}
