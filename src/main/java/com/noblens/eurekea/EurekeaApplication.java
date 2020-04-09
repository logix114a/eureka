package com.noblens.eurekea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekeaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekeaApplication.class, args);
	}

}
