package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootTest
@SpringBootApplication
@PropertySources({
	@PropertySource({"file:C:\\Users\\PC1\\Desktop\\rest-services-Maven\\recording.properties"})
})
class RestServicesMavenApplicationTests {

	@Test
	void contextLoads() {
	}

}
