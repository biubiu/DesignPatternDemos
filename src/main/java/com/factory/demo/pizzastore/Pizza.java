package com.factory.demo.pizzastore;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * User: Shawn cao
 * Date: 15/1/30
 * Time: PM2:57
 */
public abstract class Pizza {
    String name;
    String dough;
    String sause;
    List<String> toppings = Lists.newArrayList();

    public void prepare() {
        System.out.println("Prepare: " + name);
        System.out.println("Tossing dough.. ");
        System.out.println("Adding sauce.. ");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
