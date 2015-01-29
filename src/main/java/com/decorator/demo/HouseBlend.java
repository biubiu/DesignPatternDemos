package com.decorator.demo;

/**
 * User: Shawn cao
 * Date: 15/1/29
 * Time: PM5:07
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        return .89;
    }
}
