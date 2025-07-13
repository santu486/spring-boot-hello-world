package com.example.helloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloWorldController {
	
	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);


    @GetMapping("/hello")
    public String sendGreetings() {
		logger.info("Health Check Request is recieved  bu santosh health1 ");
		System.out.println("Health Check Request is recieved");
        return "Hello, World!";
    }
	
	
    @GetMapping("/hello2")
    public String sendGreetings2() {
		logger.info("Health Check Request is recieved  by santosh health 2");
		System.out.println("Health Check Request is recieved");
		
        return "Hello, World!2";
    }
	
	
    @GetMapping("/hello3")
    public String sendGreetings3() {
		logger.info("Health Check Request is recieved by santosh heakth3");
		System.out.println("Health Check Request is recieved");
		
        return "Hello, World!3";
    }
}
