package com.decorator.demo.buzzCoffee;

/**
 * User: Shawn cao
 * Date: 15/1/29
 * Time: PM4:35
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public enum Size {tall, grande, venti}
    Size size = Size.tall;
    public abstract  double cost();


    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public String getDescription(){
        return description;
    }
}
