package com.adapter.demo;

public class TurkeyAdapter  implements Duck{

	Turkey turkey;
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey; 
	}
	@Override
	public void quack() {
		turkey.gobble();		
	}

	@Override
	public void fly() {
		turkey.fly();
	}
	
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		
		Turkey wildTurkey = new WildTurkey();
		Duck turkeyAdapater = new TurkeyAdapter(wildTurkey);
		
		System.out.println( " turkey says ");
		testDuck(duck);
		
		System.out.println("\n TurkeyAdapater says ..");
		testDuck(turkeyAdapater);
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
}
