package com.perficient.techbootcampcarterleising;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.perficient.techbootcampcarterleising"})
@SpringBootApplication
@EnableJpaRepositories("com.perficient.techbootcampcarterleising")
@EntityScan("com.perficient.techbootcampcarterleising") //maybe

public class TechbootcampCarterleisingApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TechbootcampCarterleisingApplication.class);
	}
	
}
