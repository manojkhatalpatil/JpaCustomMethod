package com.csi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class JpaCustomMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaCustomMethodApplication.class, args);
	}

}
