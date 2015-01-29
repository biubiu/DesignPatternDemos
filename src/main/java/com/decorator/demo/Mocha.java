package com.decorator.demo;

/**
 * User: Shawn cao
 * Date: 15/1/29
 * Time: PM5:08
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize().equals(Size.venti)) {
            return .40 + cost;
        }else if(beverage.getSize().equals(Size.grande)){
            return .30 + cost;
        }else {
            return .20 + cost;
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha " + beverage.getSize().name();
    }
}
