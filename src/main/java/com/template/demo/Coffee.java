package com.template.demo;

public class Coffee extends CaffineBeverageWithHook{
		
	@Override
	void brew() {
		System.out.println(" Dripping coffee thru filter");
	}
	@Override
	void addCondiments() {
		System.out.println(" Adding sugar and milk");
	}
}
