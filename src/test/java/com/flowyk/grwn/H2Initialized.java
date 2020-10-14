package com.flowyk.grwn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import java.sql.*;

@SpringBootTest
public class H2Initialized {

    @Autowired
    Connection dbConnection;

    @Test
    public void dbStarted() {
        assertDoesNotThrow(() -> {
            Statement stm = dbConnection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT 1+1");
            assertTrue(rs.next());
        });
    }
}
