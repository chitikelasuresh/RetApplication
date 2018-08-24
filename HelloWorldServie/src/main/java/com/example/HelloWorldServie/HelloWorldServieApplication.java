package com.example.HelloWorldServie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@EnableOAuth2Sso
@SpringBootApplication
public class HelloWorldServieApplication {

	@GetMapping("/")
	public String getMessage() {
		return "HELLO SURESH";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldServieApplication.class, args);
	}
}
