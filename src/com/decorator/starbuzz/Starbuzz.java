package com.decorator.starbuzz;

public class Starbuzz {
	public static void main(String[] args) {
		//Beverage beverage =new Espresso();
		Beverage beverage = new Mocha(new Espresso());
		Beverage withCream = new Cream(beverage);
		System.out.println(beverage.getDescription() + " : " + beverage.cost());
		System.out.println(withCream.getDescription() + ": " + beverage.cost());
	}	
}
