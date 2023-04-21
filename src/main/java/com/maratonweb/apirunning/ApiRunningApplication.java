package com.maratonweb.apirunning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ApiRunningApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRunningApplication.class, args);
	}

}
