package com.example.jchankchan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	String hello(@RequestParam(name = "message", required = false) String message){
		if (message == null || message.isEmpty() || message.isBlank()) {
			return "Hello JchanKchan!";
		} else {
			return "Hello " + message + "!";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
