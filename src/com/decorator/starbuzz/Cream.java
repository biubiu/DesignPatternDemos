package com.decorator.starbuzz;

public class Cream extends CondimentDecorator {
	Beverage beverage;
	public Cream(Beverage beverage) {
		this.beverage =beverage;
	}
	@Override
	public String getDescription() {		
		return beverage.getDescription() + " with cream";
	}
	@Override
	public double cost() {
		return beverage.cost() + 0.12;
	}

}
