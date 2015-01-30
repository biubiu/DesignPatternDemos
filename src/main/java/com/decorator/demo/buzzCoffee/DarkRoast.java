package com.decorator.demo.buzzCoffee;

/**
 * User: Shawn cao
 * Date: 15/1/29
 * Time: PM4:37
 */
public class DarkRoast extends Beverage {
    Beverage beverage;

    public DarkRoast(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1.45;
    }
}
