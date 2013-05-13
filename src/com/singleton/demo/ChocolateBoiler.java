package com.singleton.demo;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	//private static ChocolateBoiler uniqueChocolateBoiler;
	
	//the volatile ensures that multiple threads handle the unique instance correctly
	//when it is being initialized to the singleton instance
	private static volatile ChocolateBoiler uniqueChocolateBoiler;
/*	public ChocolateBoiler(){
		empty = false;
		boiled = false;
	}*/
	
	private ChocolateBoiler() {
		empty = false;
		boiled = false;
	}
	
	/*public static ChocolateBoiler getInstance(){
		if(uniqueChocolateBoiler == null){
			uniqueChocolateBoiler = new ChocolateBoiler();
		}
		return uniqueChocolateBoiler;
	}*/
	
	
	public static ChocolateBoiler getInstance(){
		if(uniqueChocolateBoiler == null){
			synchronized (ChocolateBoiler.class) {
				if(uniqueChocolateBoiler == null){
					uniqueChocolateBoiler = new ChocolateBoiler();
				}				
			}
		}
		return uniqueChocolateBoiler;
	}
	
	
	public void fill(){
		if(isEmpty()){
			empty = false;
			boiled = false;
		}
	}
	
	public void drained(){
		if(!isEmpty() && isBoiled()){
			empty = true;
		}
	}
	
	public void boid(){
		if(!isEmpty() && !isBoiled()){
			boiled = true;
		}
	}
	
	public boolean isEmpty(){
		return empty;
	}
	public boolean isBoiled(){
		return boiled;
	}
}
