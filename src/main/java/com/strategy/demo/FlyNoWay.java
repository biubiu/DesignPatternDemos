package com.strategy.demo;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: PM12:29
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return "I can't fly";
    }
}
