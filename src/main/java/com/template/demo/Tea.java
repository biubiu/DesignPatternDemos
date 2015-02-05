package com.template.demo;

public class Tea extends CaffineBeverageWithHook{	
	@Override
	public String brew() {
        String brew = " Steeping the tea ";
        System.out.println(brew);
        return brew;
	}

	@Override
	public String addCondiments() {
        String condiments = "lemon";
        System.out.println(condiments);
        return condiments;
	}
	
	@Override
	boolean customerWantsCondiments() {	
		return false;
	}

}
