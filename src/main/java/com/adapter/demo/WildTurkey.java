package com.adapter.demo;

public class WildTurkey implements Turkey{


	@Override
	public void fly() {
		System.out.println("Flying with a long distance");
	}

	@Override
	public void gobble() {
		System.out.println(" Gobble gobble");
		
	}

}
