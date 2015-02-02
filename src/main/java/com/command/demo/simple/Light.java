package com.command.demo.simple;

/**
 * User: Shawn cao
 * Date: 15/2/2
 * Time: AM10:44
 */
public class Light {
    public String on() {
        System.out.println("lights on ");
        return "lights on";
    }

    public String off() {
        System.out.println("lights off");
        return "lights off";
    }
}
