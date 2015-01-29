package com.strategy.demo;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: PM12:37
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }
}
