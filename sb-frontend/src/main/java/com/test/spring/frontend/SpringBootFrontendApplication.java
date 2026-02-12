package com.test.spring.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.test.spring.*" })
public class SpringBootFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFrontendApplication.class, args);
	}

}
