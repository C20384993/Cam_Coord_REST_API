package com.example.fyp_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
	@PropertySource({"file:C:\\Users\\PC1\\Desktop\\rest-services-Maven\\recording.properties"})
})
public class RestServicesMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServicesMavenApplication.class, args);
	}

}
