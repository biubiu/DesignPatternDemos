package com.adapter.demo;

public class MallardDuck implements Duck{

	@Override
	public String quack() {
        String quack = "mallaradDuck quack";
        System.out.println(quack);
        return quack;
	}

	@Override
	public String fly() {
        String fly = "mallarad duck fly";
        System.out.println(fly);
        return fly;
	}
	
}
