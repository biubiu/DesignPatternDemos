package com.command.demo.simple;

/**
 * User: Shawn cao
 * Date: 15/2/2
 * Time: AM10:44
 */
public class LightOnCommand implements  Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.on();
    }
}
