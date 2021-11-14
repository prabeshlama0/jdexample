package com.example.jdexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JdexampleApplication {



	@GetMapping("/get")
	public String get(){
	return 	"Jenkins to Docker";
	}


	@GetMapping("/get")
	public String get2(){
		return 	"Jenkins to Docker";
	}
	public static void main(String[] args) {
		SpringApplication.run(JdexampleApplication.class, args);




	}

}
