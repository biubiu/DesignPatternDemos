package com.decorator.demo.buzzCoffee;

/**
 * User: Shawn cao
 * Date: 15/1/29
 * Time: PM5:06
 */
public class Espresso extends  Beverage {

    public  Espresso(){
        super.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
