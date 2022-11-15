package com.example.demo;
import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainClassRun {
    public static void main(String[] args) throws SQLException {
        SpringApplication.run(MainClassRun.class, args);
    }
}