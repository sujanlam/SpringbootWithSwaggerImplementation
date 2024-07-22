package com.swag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerUiSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerUiSpringAppApplication.class, args);
		System.out.println("Swagger UI Application Started");
	}

}
