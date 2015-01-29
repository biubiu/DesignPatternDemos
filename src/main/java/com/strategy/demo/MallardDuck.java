package com.strategy.demo;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: PM12:25
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        super.setQuackBehavior(new MuteQuack());
        super.setFlyBehavior(new FlyWithWings());
    }
}
