package com.template.demo;

public class Tea extends CaffineBeverageWithHook{	
	@Override
	void brew() {
		System.out.println(" Steeping the tea ");
		
	}
	@Override
	void addCondiments() {
		System.out.println(" Adding lemon");
		
	}
	
	@Override
	boolean customerWantsCondiments() {	
		return false;
	}
	
	public static void main(String[] args) {
		CaffineBeverageWithHook tea = new Tea();
		tea.prepareRecipe();
	}
}
