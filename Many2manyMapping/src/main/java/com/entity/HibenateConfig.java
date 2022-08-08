package com.entity;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibenateConfig {

	private static SessionFactory sf;
	private Environment environment;

	public SessionFactory getFactory() {

		if (sf == null) {
			try {
				Properties properties = new Properties();
				properties.put(environment.DRIVER, "org.postgresql.Driver");
				properties.put(environment.URL, "jdbc:postgresql://localhost:5432/postgres?currentSchema=test");
				properties.put(environment.USER, "postgres");
				properties.put(environment.PASS, "root");

				// hibernate configuration details
				properties.put(environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
				properties.put(environment.HBM2DDL_AUTO, "create");
				properties.put(environment.SHOW_SQL, "true");
				properties.put(environment.FORMAT_SQL, "true");

				Configuration cfg = new Configuration();
				cfg.setProperties(properties);
				cfg.addAnnotatedClass(Employee.class);
				cfg.addAnnotatedClass(Project.class);

				ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties())
						.build();

				sf = cfg.buildSessionFactory(registry);

			} catch (Throwable e) {
				System.out.println("could not create sessio factory");
				new ExceptionInInitializerError(e);
			}
		}

		return sf;
	}

}
