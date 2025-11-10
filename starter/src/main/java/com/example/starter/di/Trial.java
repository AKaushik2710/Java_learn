package com.example.starter.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Trial {
	public static void main(String[] args) {
		ApplicationContext me = new AnnotationConfigApplicationContext(DI2.class);
		DI m = me.getBean(DI.class);
		m.main(args);
	}
}
