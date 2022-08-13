package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EcommerceWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceWebsiteApplication.class, args);
	}

}
