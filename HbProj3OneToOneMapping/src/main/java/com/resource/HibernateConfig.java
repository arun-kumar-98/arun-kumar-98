package com.resource;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.model.Modul;
import com.model.Project;

public class HibernateConfig {

	private static SessionFactory sf;

	private Environment environment;

	public SessionFactory getSessionFactory() {
		if (sf == null) {
			try {

				Properties prop = new Properties();
				prop.put(environment.DRIVER, "org.postgresql.Driver");
				prop.put(environment.URL, "jdbc:postgresql://localhost:5432/postgres?currentSchema=test");
				prop.put(environment.USER, "postgres");
				prop.put(environment.PASS, "root");
				prop.put(environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
				prop.put(environment.HBM2DDL_AUTO, "update");
				prop.put(environment.SHOW_SQL, "true");

				Configuration cfg = new Configuration();
				cfg.setProperties(prop);
				cfg.addAnnotatedClass(Modul.class);
				cfg.addAnnotatedClass(Project.class);

				ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties())
						.build();
				sf = cfg.buildSessionFactory(registry);

			} catch (Throwable e) {
				System.out.println("session factory could not connected  " + e);
				throw new ExceptionInInitializerError(e);
			}
		}

		return sf;
	}

}
