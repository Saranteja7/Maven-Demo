package com.verizon.slack.slackapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SlackAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlackAppApplication.class, args);
		System.out.println("Hello World new");
	}

}
