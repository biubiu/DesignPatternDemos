package com.template.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeWithHook extends CaffineBeverageWithHook{

	@Override
	void brew() {
		System.out.println(" Dripping coffee thru filter");
	}
	@Override
	void addCondiments() {
		System.out.println(" Adding sugar and milk");
	}
	
	public boolean customerWantsCondiments(){
		String answer = getUserInput();
		if(answer.toLowerCase().equals("yy"))
			return true;
		return false;		
	}
	
	private String getUserInput(){
		String answer = null;
		
		System.out.println("Would u like milk and sugar in ur coffee(Y/N) /n ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			answer = br.readLine();			
		}catch(IOException e){
			System.out.println(" err reading");
		}
		if(answer==null){
			return "no";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		CaffineBeverageWithHook coffee = new CoffeWithHook();
		coffee.prepareRecipe();
	}
}
