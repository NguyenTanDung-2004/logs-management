package com.example.LogsMangement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class LogsMangementApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(LogsMangementApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LogsMangementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.warn("nguyentandung");
	}
}
