package com.daemon.daemonDemo.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.*;

@RestController
public class welcome {
	
	@GetMapping
	public String greet() {
		String message = "daemon is working" +"\r\n"+ "Time : " + LocalDateTime.now();
		return message;
	}

}
