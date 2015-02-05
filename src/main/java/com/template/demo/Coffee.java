package com.template.demo;

public class Coffee extends CaffineBeverageWithHook{
		
	@Override
	public String brew() {
        String brew = " Dripping coffee through filter";
        System.out.println(brew);
        return brew;
	}
	@Override
	public String addCondiments() {
        String condiments = "sugar and milk";
        System.out.println(condiments);
        return condiments;
	}
}
