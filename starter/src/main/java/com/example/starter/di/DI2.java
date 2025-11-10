package com.example.starter.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DI2 {
	@Bean
	public DI myService(DItrial1 t) {
		return new DI(t);
	}
}
