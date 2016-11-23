package com.ppro.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.ppro")
@EnableJpaRepositories(basePackages = "com.ppro.persistence")
@EntityScan(basePackages = "com.ppro.model")
public class TicketManagerApplication extends SpringBootServletInitializer {


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TicketManagerApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(TicketManagerApplication.class, args);
	}
}
