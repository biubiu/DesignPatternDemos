package com.command.demo.simple;

/**
 * User: Shawn cao
 * Date: 15/2/2
 * Time: PM2:08
 */
public class LightOffCommand implements  Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.off();
    }
}
