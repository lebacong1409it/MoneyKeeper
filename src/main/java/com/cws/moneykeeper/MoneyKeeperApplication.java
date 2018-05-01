package com.cws.moneykeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.cws.moneykeeper")
public class MoneyKeeperApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MoneyKeeperApplication.class, args);
	}
}
