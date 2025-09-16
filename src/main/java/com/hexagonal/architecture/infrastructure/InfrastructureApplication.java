package com.hexagonal.architecture.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hexagonal.architecture.infrastructure", "com.hexagonal.architecture.infradetails.persistence"})
@EnableJpaRepositories(basePackages = {"com.hexagonal.architecture.infradetails.persistence.repository"})
@EntityScan(basePackages = {"com.hexagonal.architecture.infradetails.persistence.entity"})
public class InfrastructureApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfrastructureApplication.class, args);
    }

}
