package com.strategy.demo;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: PM12:32
 */
public class Quack implements  QuackBehavior {
    @Override
    public String quack() {
        return "Quack";
    }
}
