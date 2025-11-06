package com.example.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
	@GetMapping("/hello")
	public String helloWorld() {
		return "I'm fine";
	}
	
	@GetMapping("/runner")
	public int intReturn() {
		return 23;
	}
}
