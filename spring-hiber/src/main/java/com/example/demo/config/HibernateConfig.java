package com.example.demo.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConfig {

	@Value("${db.driver}")
	private String driver;

	@Value("${db.url}")
	private String url;

	@Value("${db.user}")
	private String user;

	@Value("${db.password}")
	private String password;

	@Value("${hibernate.dialect}")
	private String dialect;

	@Value("${hibernate.showsql}")
	private String show_sql;

	@Value("${hibernate.hbm2ddl.auto}")
	private String ddl;

	@Value("${entitymanager.packageToScan}")
	private String packageToScan;

	@Bean
	public LocalSessionFactoryBean getFactory() {
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();

		sf.setDataSource((javax.sql.DataSource) dataSource());
		sf.setPackagesToScan(packageToScan);
		Properties properties = new Properties();
		properties.put("dialect", dialect);
		properties.put("show_sql", show_sql);
		properties.put("ddl", ddl);
		sf.setHibernateProperties(properties);

		return sf;
	}

	@Bean
	public javax.sql.DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url, user, password);
		dataSource.setDriverClassName(driver);

		return dataSource;

	}

	@Bean
	public HibernateTransactionManager hibernateTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getFactory().getObject());
		return transactionManager;

	}

}
