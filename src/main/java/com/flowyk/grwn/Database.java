package com.flowyk.grwn;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class Database {
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

    @Autowired
    EntityManagerFactory emFactory;
    @Bean
    public SessionFactory hibernateFactory() {
        if (emFactory.unwrap(SessionFactory.class) == null) {
            throw new IllegalStateException("Unknown entity manager factory implementation");
        }
        return emFactory.unwrap(SessionFactory.class);
    }
}
