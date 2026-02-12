package com.test.spring.jpa.postgresql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import jakarta.activation.DataSource;

@ExtendWith(MockitoExtension.class)
public class JdbcMockingUnitTest {
    @Mock
    DataSource dataSource;
    @Mock
    Connection conn;
    @Mock
    Statement stmt;
    @Mock
    ResultSet resultSet;
}
