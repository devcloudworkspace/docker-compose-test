package com.test.spring.jpa.postgresql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.test.spring.*")
public class SpringBootJpaPostgresqlApplication {

	private Logger LOG = LoggerFactory.getLogger(SpringBootJpaPostgresqlApplication.class);
	
	

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootJpaPostgresqlApplication.class, args);
	}

}
