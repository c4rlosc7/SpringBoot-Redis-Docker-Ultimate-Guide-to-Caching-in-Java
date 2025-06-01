package com.example.SpringBootRedisDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootRedisDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisDockerApplication.class, args);
	}

}
