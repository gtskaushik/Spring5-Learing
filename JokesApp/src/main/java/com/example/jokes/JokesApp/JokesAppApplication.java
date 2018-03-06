package com.example.jokes.JokesApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class JokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesAppApplication.class, args);
	}
}
