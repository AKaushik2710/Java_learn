package com.example.starter.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

interface diTrial{
	String runner(String str);
}

//@Service
class DItrial1 implements diTrial{
	@Override
	public String runner(String str) {
		return "Trial 1 is printing" + str;
	}
}

//@Service
class DItrial2 implements diTrial{
	@Override
	public String runner(String str) {
		return "Tial 2 is printing" + str;
	}
}
public class DI{
	private diTrial myTrial;
	
	DI(diTrial myTrial){
		this.myTrial = myTrial;
	}
	
	public static void main(String[] args) {
		DI di = new DI(new DItrial2());
		di.myTrial.runner("Aman");
	}
}
