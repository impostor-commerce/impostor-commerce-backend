package com.sparta.b2b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = "com.sparta", exclude = { SecurityAutoConfiguration.class })
public class B2bApplication {

	public static void main(String[] args) {
		SpringApplication.run(B2bApplication.class, args);

	}

}
