package com.factory.demo.pizzastore;

/**
 * User: Shawn cao
 * Date: 15/1/30
 * Time: PM3:30
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sause = "Marinara Sauce";
        toppings.add("Grated Reggiamo Cheese");
    }

    public void cut(){
        System.out.println("Cutting the pizza into square");
    }
}
