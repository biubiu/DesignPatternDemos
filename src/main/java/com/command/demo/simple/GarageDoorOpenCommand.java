package com.command.demo.simple;

/**
 * User: Shawn cao
 * Date: 15/2/2
 * Time: PM12:03
 */
public class GarageDoorOpenCommand implements Command {

    Door door;
    public GarageDoorOpenCommand(Door door){
        this.door = door;
    }

    @Override
    public String execute() {

        return door.rollUp();
    }
}
