package com.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.model.Dept;
import com.model.Employee;

public class HibernateUtil {
	private static SessionFactory sf;
	private Environment environment;

	public SessionFactory getSessionFactory() {
		if (sf == null) {
			try {
				Configuration configuration = new Configuration();

				Properties prop = new Properties();
				prop.put(environment.DRIVER, "org.postgresql.Driver");
				prop.put(environment.URL, "jdbc:postgresql://localhost:5432/postgres?currentSchema=test");
				prop.put(environment.USER, "postgres");
				prop.put(environment.PASS, "root");
				/*
				 * Hibernate configuration details
				 */
				prop.put(environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
				prop.put(environment.HBM2DDL_AUTO, "update");
				prop.put(environment.SHOW_SQL, "true");

				configuration.setProperties(prop);
				// configure annotated model entity classes
				configuration.addAnnotatedClass(Employee.class);
				configuration.addAnnotatedClass(Dept.class);

				// register all configuration
				ServiceRegistry registry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sf = configuration.buildSessionFactory(registry);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sf;
	}

}
