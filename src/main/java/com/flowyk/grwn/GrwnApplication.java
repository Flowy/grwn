package com.flowyk.grwn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class GrwnApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrwnApplication.class, args);
	}

	@Value("${jdbc.url}")
	String jdbcUrl;

	private Connection connection;
	@Bean
	public Connection dbConnection() throws SQLException {
		if (connection == null) {
			connection = DriverManager.getConnection(jdbcUrl);
		}
		return connection;
	}
}
