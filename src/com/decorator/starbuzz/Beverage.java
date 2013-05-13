package com.decorator.starbuzz;

public abstract class Beverage {
	String  description = "Unknown Berverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
