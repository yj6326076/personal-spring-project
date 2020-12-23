package com.little.smile.personalSpringProject.baseServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author little yang
 */
@EnableOpenApi
@SpringBootApplication
public class PersonalSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalSpringProjectApplication.class, args);
	}

}
