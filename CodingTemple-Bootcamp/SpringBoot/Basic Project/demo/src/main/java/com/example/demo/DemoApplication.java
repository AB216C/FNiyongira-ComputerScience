package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//DemoApplication.java: Your main class with @SpringBootApplication
//pom.xml: Manages dependencies (like Spring Web)
//src/main/java: Where your code lives
//src/main/resources: Where config files like application.properties

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public String beanExample(){
		return "Janet";
	}

	@Bean
	public String beanExample2(){
		return "Johnathan";
	}

}
