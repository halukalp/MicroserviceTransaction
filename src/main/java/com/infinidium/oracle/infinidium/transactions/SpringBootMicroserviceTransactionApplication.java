package com.infinidium.oracle.infinidium.transactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringBootMicroserviceTransactionApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootMicroserviceTransactionApplication.class, args);
	}

}
