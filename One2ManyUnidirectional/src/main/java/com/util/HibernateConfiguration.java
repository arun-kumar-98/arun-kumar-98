package com.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.entity.Child;
import com.entity.Parent;

public class HibernateConfiguration {

	private SessionFactory sf;
	private Environment environment;
	/*
	 * getFactory()
	 * 
	 * properties to set all database and hibenate configuration return
	 * session-factory object
	 * 
	 */

	public SessionFactory getFactory() {
		if (sf == null) {
			try {
				Properties properties = new Properties();
				// postgresql configuration details
				properties.put(environment.DRIVER, "org.postgresql.Driver");
				properties.put(environment.URL, "jdbc:postgresql://localhost:5432/postgres?currentSchema=test");
				properties.put(environment.USER, "postgres");
				properties.put(environment.PASS, "root");

				// hibernate confiuration
				properties.put(environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
				properties.put(environment.HBM2DDL_AUTO, "update");
				properties.put(environment.SHOW_SQL, "true");
				properties.put(environment.FORMAT_SQL, "true");

				Configuration cfg = new Configuration();
				cfg.setProperties(properties);

				cfg.addAnnotatedClass(Parent.class);
				cfg.addAnnotatedClass(Child.class);

				ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties())
						.build();

				sf = cfg.buildSessionFactory(registry);

			} catch (Throwable ex) {
				System.out.println("could not ccreate the session factory : " + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}

		return sf;
	}

}
