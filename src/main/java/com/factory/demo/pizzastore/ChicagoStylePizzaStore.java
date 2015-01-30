package com.factory.demo.pizzastore;

/**
 * User: Shawn cao
 * Date: 15/1/30
 * Time: PM3:18
 */
public class ChicagoStylePizzaStore extends  PizzaStore {
    @Override
    Pizza createPizza(PizzaType type) {
        if(type.equals(PizzaType.cheese))
            return new ChicagoCheesePizza();
        else
            return null;
    }
}
