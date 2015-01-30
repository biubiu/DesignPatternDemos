package com.factory.demo.pizzastore;

/**
 * User: Shawn cao
 * Date: 15/1/30
 * Time: PM3:17
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaType type) {
        if(type.equals(PizzaType.cheese)){
            return new NYStyleCheesePizza();
        } else if (type.equals(PizzaType.veggie)){
            return new NYStyleVeggiePizza();
        } else if (type.equals(PizzaType.clam)){
            return new NYStyleClamPizza();
        }   else if(type.equals(PizzaType.pepperoni)){
            return new NyStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
