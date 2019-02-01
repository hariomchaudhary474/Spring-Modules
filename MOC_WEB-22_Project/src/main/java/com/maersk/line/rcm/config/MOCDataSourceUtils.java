package com.maersk.line.rcm.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value="classpath:application.properties")
public class MOCDataSourceUtils {
	@Bean
	public DataSource dataSource(@Autowired Environment environment) {
		 DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 dataSource.setDriverClassName(environment.getProperty("db.driver"));
		 dataSource.setUrl(environment.getProperty("db.url"));
		 dataSource.setUsername(environment.getProperty("db.user"));
		 dataSource.setPassword(environment.getProperty("db.password"));
		return dataSource;
	}
}
