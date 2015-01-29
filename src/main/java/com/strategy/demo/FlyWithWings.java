package com.strategy.demo;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: PM12:28
 */
public class FlyWithWings implements  FlyBehavior {
    @Override
    public String fly() {
        return "I'm flying";
    }
}
