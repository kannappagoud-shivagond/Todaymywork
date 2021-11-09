package com.thbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages=("com.thbs.controller,"+"com.thbs.model,"+"com.thbs.repository"))
public class Oct18SpringBootRestProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(Oct18SpringBootRestProject1Application.class, args);
	}

}
