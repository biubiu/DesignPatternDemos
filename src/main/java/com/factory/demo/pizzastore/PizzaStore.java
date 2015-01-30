package com.factory.demo.pizzastore;

/**
 * User: Shawn cao
 * Date: 15/1/30
 * Time: PM2:53
 */
public abstract class PizzaStore {

    public enum PizzaType {cheese, veggie,clam, pepperoni}

    public Pizza orderPizza(PizzaType type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(PizzaType type);
}
