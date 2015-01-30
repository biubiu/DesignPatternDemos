package com.decorator.demo.buzzCoffee;

/**
 * User: Shawn cao
 * Date: 15/1/29
 * Time: PM5:11
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.33 + beverage.cost();
}

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }
}
