package com.factory.pizzaStore;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new NYStylePizza();
		}else {
			return null;
		}
	}

}
