package com.strategy.demo;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: PM12:14
 */
public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior behavior){
        this.quackBehavior = behavior;

    }
    public void setFlyBehavior(FlyBehavior behavior){
        this.flyBehavior = behavior;
    }
    public String performQuack(){
            return this.quackBehavior.quack();
    }

    public String performFly(){
        return this.flyBehavior.fly();
    }

    public String display(){
        return this.getClass().getName();
    }

    public String swim(){
            return "swim";
    }
}
