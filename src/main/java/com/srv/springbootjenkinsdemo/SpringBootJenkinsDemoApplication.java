package com.srv.springbootjenkinsdemo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsDemoApplication {
	public static Logger logger=LoggerFactory.getLogger(SpringBootJenkinsDemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started....");
	}

	public static void main(String[] args) {
		logger.info("Application executed....");
		SpringApplication.run(SpringBootJenkinsDemoApplication.class, args);
	}

}
