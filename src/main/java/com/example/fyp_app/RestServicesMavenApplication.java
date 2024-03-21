//Spring Boot REST API, Part of Cam-Coord Final Year Project
//Author: Ciaran MacDermott, C20384993
//Date: 21/03/2024
package com.example.fyp_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
	@PropertySource({"file:C:\\Users\\FYPUser\\Desktop\\rest-services-Maven\\recording.properties"})
})
public class RestServicesMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServicesMavenApplication.class, args);
	}

}
