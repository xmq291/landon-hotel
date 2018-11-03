package com.xmq291.xmq291fullstackappangularspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class Xmq291FullStackAppAngularSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Xmq291FullStackAppAngularSpringBootApplication.class, args);
	}
}
