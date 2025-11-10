package com.example.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.starter.di.DI;
import com.example.starter.di.DI2;

@RestController
public class StartController {
	private final DI myTT;
	
	@Autowired
	public StartController(DI myTT){
		this.myTT = myTT;
	}
	@GetMapping("/hello")
	public String helloWorld() {
		return "I'm fine";
	}
	
	@GetMapping("/runner")
	public int intReturn() {
		return 23;
	}
	
	@GetMapping("/t")
	public String strReturn() {
		
	}
	public static void main(String[] args) {
		StartController sx = new StartController();
		ApplicationContext ac = new AnnotationConfigApplicationContext(DI2.class);
		ac.getBean(DI.class);
	}
}
