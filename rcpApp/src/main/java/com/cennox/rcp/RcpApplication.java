package com.cennox.rcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RcpApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RcpApplication.class, args);
	}
}
