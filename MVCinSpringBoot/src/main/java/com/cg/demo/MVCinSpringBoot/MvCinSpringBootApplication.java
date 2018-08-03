package com.cg.demo.MVCinSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.cg.demo.repo")
@EntityScan("com.cg.demo.bean")
public class MvCinSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvCinSpringBootApplication.class, args);
	}
}
