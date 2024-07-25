package com.grady.learn.springboot.coolbeeza;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoolbeezaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolbeezaApplication.class, args);
	}

	// from the spring boot framework
	// Executed after the Spring Bean have been loaded
	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		// Java lambda expression
		return runner -> {
			System.out.println("Hello World!");
		};
	}
}
